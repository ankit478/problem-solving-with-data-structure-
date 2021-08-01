import java.io.*;
import java.util.*;

public class CoinCombination{
    static int coinCombination(int arr[],int amt)
    {
        int dp[]=new int[amt+1];
        dp[0]=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i];j<dp.length;j++)
            {
                dp[j]+=dp[j-arr[i]];
            }
        }
        return dp[amt];
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int amt=in.nextInt();
        System.out.println(coinCombination(arr,amt));

    }
}