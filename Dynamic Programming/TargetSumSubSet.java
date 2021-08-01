import java.io.*;
import java.util.*;

public class TargetSumSubSet{
    static boolean isTarget(int arr[],int n,int tar)
    {
       boolean dp[][]=new boolean[n+1][tar+1];
       for(int i=0;i<dp.length;i++)
       {
           for(int j=0;j<dp[0].length;j++)
           {
               if(i==0 && j==0)
               {
                   dp[i][j]=true;
               }
               else if(i==0)
               {
                   dp[i][j]=false;
               }
               else if(j==0)
               {
                   dp[i][j]=true;
               }
               else
               {
                   if(dp[i-1][j]==true)
                   {
                       dp[i][j]=true;
                   }
                   else
                   {
                       int val=arr[i-1];
                       if(j>=val)
                       {
                           if(dp[i-1][j-val]==true)
                           {
                               dp[i][j]=true;
                           }
                       }
                   }
               }
           }
       }
       return dp[arr.length][tar];
    }

    public static void main(String[] args) throws Exception {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int tar=in.nextInt();
        System.out.println(isTarget(arr,n,tar));

    }
}