import java.util.Scanner;


//dynamic stack
class Dynamic extends CustomStack
{
	public Dynamic()
	{
		super();
	}


	public Dynamic(int size)
	{
		super(size);
		
	}


	@Override
	public boolean push(int item) throws StackException {
		if(this.isFull())
		{
			int[] temp = new int[2*data.length];

			for(int i = 0; i<data.length; i++)
				temp[i] = data[i];

			data = temp;
		}


		return super.push(item);
	}
}



public class DynamicStack
{
	public static void main(String[] args) throws StackException
	{
		Dynamic  st = new Dynamic(5);
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
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}