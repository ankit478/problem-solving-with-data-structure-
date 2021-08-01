import java.util.*;
class PaintHouse1
{
	static int paintMaxCost(int arr[][],int n)
	{
		int dp[][]=new int[n][3];
		dp[0][0]=arr[0][0];
		dp[0][1]=arr[0][1];
		dp[0][2]=arr[0][2];

		for(int i=1;i<dp.length;i++)
		{
			dp[i][0]=arr[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
			dp[i][1]=arr[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
			dp[i][2]=arr[i][2]+Math.max(dp[i-1][0],dp[i-1][1]);
		}
		int res=Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
		return res;

	}
	public static void main(String[] args) 
	{
                  
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println(paintMaxCost(arr,n));
}
}