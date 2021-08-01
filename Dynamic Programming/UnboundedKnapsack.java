	import java.io.*;
	import java.util.*;

	public class UnboundedKnapsack{
	    static int knapsack(int val[],int wgt[],int n,int cap)
	    {
	        int dp[]=new int[cap+1];
	        dp[0]=0;
	        for(int i=1;i<dp.length;i++)
	        {
	            int max=0;
	            for(int j=0;j<val.length;j++)
	            {
	                if(i>=wgt[j])
	                {
	                        
	                  int rcap=i-wgt[j];
	                  int rval=dp[rcap];
	                  int total=rval+val[j];
	                  if(total>max)
	                  {
	                      max=total; 
	                  }
	                }
	            }
	            dp[i]=max;
	        }
	        return dp[cap];
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