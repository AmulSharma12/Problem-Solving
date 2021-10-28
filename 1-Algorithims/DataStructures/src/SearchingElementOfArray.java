import java.util.Arrays;

public class SearchingElementOfArray {
    public static void main(String[] args) {
        int [] i={45,2,735,21};
        System.out.println("Before Searching!");
        Arrays.sort(i);
        for(int i1:i)
        {
            System.out.println(i1);
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(i,45));
        System.out.println(Arrays.binarySearch(i,88));
    }
}
