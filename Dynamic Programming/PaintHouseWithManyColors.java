import java.io.*;
import java.util.*;

public class PaintHouseWithManyColors{
    static int paintCost(int arr[][],int n,int k)
    {
        int dp[][]=new int[n][k];
        int least=Integer.MAX_VALUE;
        int sleast=Integer.MAX_VALUE;
        for(int j=0;j<dp[0].length;j++)
        {
            dp[0][j]=arr[0][j];
            if(arr[0][j]<=least)
            {
                sleast=least;
                least=arr[0][j];
            }
            else if(arr[0][j]<=sleast)
            {
                sleast=arr[0][j];
            }
        }
        for(int i=1;i<dp.length;i++)
        {
            int nleast=Integer.MAX_VALUE;
            int nsleast=Integer.MAX_VALUE;
            for(int j=0;j<dp[0].length;j++)
            {
                if(dp[i-1][j]!=least)
                {
                    dp[i][j]=least+arr[i][j];
                }
                else
                {
                    dp[i][j]=sleast+arr[i][j];
                }
                
                if(dp[i][j]<=nleast)
                {
                    nsleast=nleast;
                    nleast=dp[i][j];
                }
                else if(dp[i][j]<=nsleast)
                {
                   nsleast=dp[i][j]; 
                }
                
            }
            least=nleast;
            sleast=nsleast;
        }
        return least;
        
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[][]=new int[n][k];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println(paintCost(arr,n,k));

    }
}