// https://leetcode.com/problems/matrix-diagonal-sum/


public class P7_LeetCode1572
{
	public static void main(String[] args)
	{
		int[][] mat = {
				{1,1,1,1},
				{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 1}
		};


		int result = diagonalSum(mat);
		System.out.println(result);
	}


	 public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        for(int row = 0; row<n; row++)
        {
            for(int col = 0; col<n; col++)
            {
                if(row == col   || row+col == n-1)
                    sum += mat[row][col];
            }
        }
        
        
        return sum;
    }
}