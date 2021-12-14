import java.util.Scanner;


public class P3_LeetCode1678
{
	public static void main(String[] args)
	{
		String command = "G()(al)";
		String output = interpret(command);
		System.out.println(output);
	}


	public static String interpret(String command) {
		int n = command.length();
		int currIndex = 0;
		String output = "";


		while(currIndex < n)
		{
			char ch = command.charAt(currIndex);
			if(ch == 'G')
            {
                output += "G";
                currIndex++;
            }
			else
			{
				currIndex++;
                ch = command.charAt(currIndex);

				if(ch == 'a')
				{
                   output += "al";
					currIndex += 3;
				}
				else
				{
                     output += "o";
					currIndex ++;
					
				}
			}
		}

		return output; 
        
    }
}