import java.io.*;
import java.util.*;

public class GoldMine{
    static int goldMine(int arr[][],int n,int m)
    {
        int dp[][]=new int[n][m];
        for(int j=arr[0].length-1;j>=0;j--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if(i==0)
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
                }
                else if(i==arr.length-1)
                {
                    dp[i][j]=Math.max(dp[i-1][j+1],dp[i][j+1])+arr[i][j];
                }
                else
                {
                    int x=Math.max(dp[i-1][j+1],dp[i][j+1]);
                    dp[i][j]=Math.max(x,dp[i+1][j+1])+arr[i][j];
                }
            }
        }
        int max=0;
        for(int i=0;i<dp.length;i++)
        {
           if(dp[i][0]>max)
           {
               max=dp[i][0];
           }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
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
        System.out.println(goldMine(arr,n,m));
    }

}