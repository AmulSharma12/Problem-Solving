// Defanging an IP address

public class P1_LeetCode1108
{
	public static void main(String[] args)
	{
		String address = "1.1.1.1";
		String output = defangIPaddr(address);
		System.out.println(output);

	}


	public static String defangIPaddr(String address) {
        //1.) using String class
        // String result = "";
        // int n = address.length();
        
        // for(int i = 0; i<n; i++)
        // {
        // 	char ch = address.charAt(i);

        // 	if(ch == '.')
        // 		result += "[.]";
        // 	else
        // 		result += ch;
        // }

        // return result; 


    }
}