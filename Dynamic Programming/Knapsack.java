import java.io.*;
import java.util.*;

public class Knapsack{
    static int knapsack(int val[],int wgt[],int n,int cap)
    {
        int dp[][]=new int[n+1][cap+1];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(j>=wgt[i-1])
                {
                    int rcap=dp[i-1][j-wgt[i-1]];
                    if(rcap+val[i-1]>dp[i-1][j])
                    {
                        dp[i][j]=rcap+val[i-1];
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }
        return dp[n][cap];
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int val[]=new int[n];
        int wgt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            val[i]=in.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            wgt[j]=in.nextInt();
        }
        int cap=in.nextInt();
        System.out.println(knapsack(val,wgt,n,cap));

    }
}