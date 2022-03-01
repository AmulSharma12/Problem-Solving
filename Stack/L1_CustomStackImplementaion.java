// import  ./StackException;
import java.util.Scanner;


//class CustomStack
class CustomStack
{
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;

	public CustomStack()
	{
		this(DEFAULT_SIZE);
	}


	public CustomStack(int size)
	{
		this.data = new int[size];
	}


	int ptr = -1;
	//push method
	public 	boolean push(int item) throws StackException
	{
		if(isFull())
		{
			throw new StackException("Stack is full");
		}

		ptr++;
		data[ptr] = item;
		return true;
	}


	//pop method
	public int pop() throws StackException
	{
		if(isEmpty())
			throw new StackException("Cannot pop as Stack is Empty");

		return data[ptr--];
	}


	//peek method
	public int peek() throws StackException
	{
		if(isEmpty())
			throw new StackException("Cannot peek as Stack is Empty");

		return data[ptr];
	}


	//isFull method
	public boolean isFull()
	{
		return ptr == data.length-1;
	}


	//isEmpty method
	public boolean isEmpty()
	{
		return ptr == -1;
	}
}

public class L1_CustomStackImplementaion 
{
	public static void main(String[] args) throws StackException
	{
		CustomStack st = new CustomStack(5);

		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);


		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}