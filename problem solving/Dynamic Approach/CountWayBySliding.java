import java.util.*;
class CountWayBySliding
{
	static int totalWays(int n, int k)
	{
		int ways[]=new int[n+1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=k && i-j>=0;j++)
			{
				ways[i]+=ways[i-j];
			}
		}
		return ways[n];
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		System.out.println(totalWays(n,k));
	}
}