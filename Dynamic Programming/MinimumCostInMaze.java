import java.io.*;
import java.util.*;

public class MinimumCostInMaze{
    static int minimumCost(int arr[][],int n,int m)
    {
        int dp[][]=new int[n][m];
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=arr[0].length-1;j>=0;j--)
            {
                if(i==arr.length-1 && j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if(i==arr.length-1)
                {
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
                else if(j==arr[0].length-1)
                {
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else
                {
                    dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+arr[i][j];
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) throws Exception {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println(minimumCost(arr,n,m));
    }

}