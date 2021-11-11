import java.util.Scanner;
import java.util.Arrays;

public class P3_SearchSorted2dMatrix
{
	public static void main(String[] args)
	{
		int[][] arr={
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9} 
		};

		System.out.println(Arrays.toString(search(arr,10)));
	}

	//binary search function search in row between the column provided
	static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
		while(cStart <= cEnd){
			int mid = cStart + (cEnd-cStart)/2;
			
			if(matrix[row][mid] == target)
				return new int[] {row,mid};
			else if(matrix[row][mid] < target)
				cStart = mid + 1;
			else
				cEnd = mid - 1;
		}
		return new int[] {-1,-1};
	}


	//search function
	static int[] search(int[][] matrix, int target)
	{
		int rows = matrix.length;
		int cols = matrix[0].length;

		if(rows == 1){
			return binarySearch(matrix, 0, 0, cols-1, target);
		}

		int rStart = 0;
		int rEnd = matrix.length-1;
		int cMid = cols/2;

		//run the loop till 2 rows are remaining
		while(rStart < (rEnd-1))
		{
			int mid = rStart + (rEnd-rStart)/2;

			if(matrix[mid][cMid] == target)
				return new int[]{mid,cMid};
			else if(matrix[mid][cMid] < target)
				rStart = mid;
			else
				rEnd = mid;
		}


		//now we have two rows
		//checking in both the cMid
		if(matrix[rStart][cMid] == target)
			return new int[]{rStart, cMid};

		if(matrix[rStart+1][cMid] == target  && rStart<cols)
			return new int[] {rStart+1, cMid};

		//otherwise search in all4 halfs
		//first half first row
		if(target <= matrix[rStart][cMid-1])
			return binarySearch(matrix,rStart,0,cMid-1,target);


		//second half first row
		if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1])
			return binarySearch(matrix,rStart,cMid+1,cols-1,target);


		//third half second row
		if(target <= matrix[rStart+1][cMid-1]  && (rStart<cols || cMid>0))
			return binarySearch(matrix,rStart+1,0,cMid-1,target);

		//fourth half seconde row
		else
		return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);

	}
}