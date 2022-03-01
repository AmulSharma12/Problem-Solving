import java.util.Scanner;

class CustomQueue
{
	private int[] data;
	private static final int DEFAULT_SIZE = 10;

	public CustomQueue()
	{
		this(DEFAULT_SIZE);
	}


	public CustomQueue(int size)
	{
		this.data = new int[size];
	}

	//wherever end point it indicated that there is no element here and can be insert 
	int end = 0;


	//insert method first we will insert and move the pointer
	public void insert(int item) throws QueueException
	{
		if(isFull())
			throw new QueueException("Queue is full");

		data[end++] = item;
	}


	public int remove() throws QueueException
	{
		if(isEmpty())
			throw new QueueException("Queue is empty");

		int removed = data[0];
		//shifting will make the first element remove

		for(int i = 1; i<end; i++)
			data[i-1] = data[i];
		end--;

		return removed;
	}



	public void display()
	{
		for(int i = 0; i<end; i++)
			System.out.print(data[i] + " <- ");
	}



	public boolean isFull()
	{
		return end == data.length;
	}



	public boolean isEmpty()
	{
		return end == 0;
	}
}

public class CustomQueueImplementation 
{
	public static void main(String[] args) throws QueueException
	{
		CustomQueue queue = new CustomQueue(5);

		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);

		queue.display();
		System.out.println("");
		System.out.println("-------------------------");

		queue.remove();
		queue.display();
	}
}