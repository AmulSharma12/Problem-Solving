import java.util.*;

class MyComparator implements  Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String str1=obj1.toString();
        String str2=obj2.toString();

        return str2.compareTo(str1);
    }
}

class Codeeaze
{
    public static void main(String[] args)
    {
        String[] str={"Warner","Smith","Kohli","Pandya","Bumrah"};
        System.out.println("Before Sorting:");
        for (String str1: str)
        {
            System.out.println(str1);
        }
        System.out.println("-----------------");

        Arrays.sort(str,new MyComparator());
        System.out.println("After Sorting:");
        for (String str1: str)
        {
            System.out.println(str1);
        }
    }
}