import java.io.*;
import java.util.Arrays;

public class SecondAlgorithm {
	
	  public static int helper(int A[][], int i, int j, int dp[][])
	  {
	    if (i == A.length) 
	    {
	      return 0;
	    }
	    if (dp[i][j] != -1) 
	    	return dp[i][j];   
	    return dp[i][j] = A[i][j] + Math.min(helper(A, i+1, j, dp), helper(A, i+1, j + 1, dp));
	  }
	 
	  public static int minSumPath(int A[][]) 
	  {
	    int n = A.length;
	    int dp[][] = new int[n][n];
	    for(int[] row : dp)
	      Arrays.fill(row,-1);
	    return helper(A, 0, 0, dp);
	  }
	 
	  public static void main(String[] args)
	  {
int A [][] = { { 2 },
	                  { 3, 9 },
	                  { 1, 6, 7 } };
	    System.out.print(minSumPath(A));
	  }
}