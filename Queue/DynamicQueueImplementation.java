import java.util.Scanner;

class DynamicQueue extends CircularQueue
{
	public DynamicQueue()
	{
		super();
	}

	public DynamicQueue(int size)
	{
		super(size);
	}


	public void insert(int item) throws QueueException
	{
		if(isFull())
		{
			int[] temp = new int[2*data.length];

			for(int i = 0; i<data.length; i++)
				temp[i] = data[(i+front)%data.length];

			front = 0;
			end = data.length;
			data = temp;
		}

		super.insert(item);
	}
}

public class DynamicQueueImplementation
{
	public static void main(String[] args) throws QueueException
	{
		DynamicQueue queue = new DynamicQueue(5);

		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.insert(8);
		queue.insert(9);

		queue.display();
		System.out.println(queue.front());
		System.out.println(queue.remove());
		queue.display();
	}
}