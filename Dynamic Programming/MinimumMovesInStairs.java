import java.io.*;
import java.util.*;

public class MinimumMovesInStairs{
    static int countPath(int arr[])
    {
        Integer dp[]=new Integer[arr.length+1];
        dp[arr.length]=0;
        
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>0)
            {
                int min=Integer.MAX_VALUE;
                for(int j=1;j<=arr[i] && i+j<dp.length;j++)
                {
                    if(dp[i+j]!=null)
                    min=Math.min(min,dp[i+j]);
                }
                if(min!=Integer.MAX_VALUE)
                {
                    dp[i]=min+1;
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(countPath(arr));
        
    }

}