import java.util.Scanner;

public class MergeSort
{
	public static void main(String[] args)
	{
		int[] arr1 = {2,3,55,78,9,2,23};
		int[] arr2 = {3,5,6,7,5453,5879};

		int[] result = mergeSort();
		System.out.println(Arrays.toString(result)); 
	}

	static int[] mergeSort(int[] arr1,int[] arr2)
	{
		int m = arr1.length;
		int n = arr2.length;

		int[] ans = new int[m+n];
		int i=0,j=0,k=0;
		
		while(i<m || j<n)
		{
			if(arr1[i] < arr2[j])
				ans[k++] = arr[i++];
			else
				ans[k++] = arr[j++];
		}

		for(;i<m;) ans[k++] = arr1[i++];
		for(;j<n;) ans[k++] = arr2[j++];	

		return ans;
	}
}