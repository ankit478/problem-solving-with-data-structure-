import java.io.*;
import java.util.*;

public class PartitionInTokSubset{
        
    public static long partitionKSubset(int n, int k) {
        
        long dp[][]=new long[k+1][n+1];
        
        if(n==0 || k==0||n<k)
        {
            return 0;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(j<i)
                {
                    dp[i][j]=0;
                }
                else if(j==i)
                {
                    dp[i][j]=1;
                }
                else
                {
                    dp[i][j]=dp[i-1][j-1]+dp[i][j-1]*i;
                }
            }
        }
        return dp[k][n];
        
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}