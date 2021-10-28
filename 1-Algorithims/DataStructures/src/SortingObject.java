import java.util.Arrays;

public class SortingObject {
    public static void main(String[] args) {
        String []str={"warner","smith","kohli","rohit"};
        System.out.println("Before Sorting!");
        for(String str1:str)
        {
            System.out.println(str1);
        }
        System.out.println("");
        Arrays.sort(str);
        System.out.println("After Sorting: ");
        for(String str1:str)
        {
            System.out.println(str1);
        }

    }
}
