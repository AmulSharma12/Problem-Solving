import java.util.Arrays;

public class SortingPrimitives {
    public static void main(String[] args) {
        byte[]b={7,45,18,10,1};
        System.out.println("Before Sorting!");
                for(byte b1:b)
                {
                    System.out.println(b1+" ");
                }
        System.out.println();
                Arrays.sort(b);
                System.out.println("After Sorting!");
                        for(byte b1:b)
                        {
                            System.out.println(b1+" ");
                        }
    }
}
