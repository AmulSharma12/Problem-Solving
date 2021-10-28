import java.util.Arrays;

public class SearchingByTargetElement {
    public static void main(String[] args) {
        String str[]={"Messi","Ronaldo","Neymar","dhoni"};
        System.out.println("Before Searching:");
        Arrays.sort(str);
        for(String str1:str)
        {
            System.out.println(str1);
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(str,"Messi"));
        System.out.println(Arrays.binarySearch(str,"Ronaldo"));
    }
}
