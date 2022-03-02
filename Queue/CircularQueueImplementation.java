import java.util.Scanner;

class CircularQueue
{
	private int[] data;
	private static final int DEFAULT_SIZE = 10;

	protected int front = 0;
	protected int end = 0;
	protected int size = 0;

	public CircularQueue()
	{
		this(DEFAULT_SIZE);
	}


	public CircularQueue(int size)
	{
		this.data = new int[size];
	}

	//insert method()
	public void insert (int item) throws QueueException
	{
		if(isFull())
			throw new QueueException("Queue is full");
		data[end++] = item;
		size++;
		end %= data.length;
		return;
		
	}

	//remove() method
	public int remove() throws QueueException
	{
		if(isEmpty())
			throw new QueueException("Queue is empty");
		
		int removed = data[front++];
		size--; 
		front = front % data.length;
		return removed;

	}


	public void display() throws QueueException
	{
		if(isEmpty())
			throw new QueueException("Queue EMpty");
		int i = front;
		do{
			System.out.print(data[i] + " - ");
			i++;
			i %= data.length;
		}while(i != end);

		return;
	}



	//front method()
	public int front() throws QueueException
	{
		if(isEmpty())
			throw new QueueException("Queue is empty");
		return data[front];
	}


	//isFull() method
	public boolean isFull()
	{
		return size == data.length;
	}


	//isEmpty() method
	public boolean isEmpty()
	{
		return size == 0;
	}
}

public class CircularQueueImplementation
{
	public static void main(String[] args) throws QueueException
	{
		CircularQueue queue = new CircularQueue(5);

		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.insert(8);


		System.out.println(queue.front());
		queue.display();
		System.out.println("removed element : " + queue.remove());
		System.out.println(queue.front());
		queue.display();
	}
}