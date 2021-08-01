import java.io.*;
import java.util.*;

public class CoinPermutation{
    static int permutation(int coins[],int amt)
    {
        int dp[]=new int[amt+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++)//i stand for amount
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i>=coins[j])
                {
                dp[i]+=dp[i-coins[j]];
                }
            }
        }
        return dp[amt];
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<coins.length;i++)
        {
            coins[i]=in.nextInt();
        }
        int amt=in.nextInt();
        System.out.println(permutation(coins,amt));

    }
}