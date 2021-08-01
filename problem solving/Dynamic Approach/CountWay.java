import java.util.*;
class CountWay
{
	static int totalWays(int n,int k)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		int ways[]=new int[n+1];
		int way=0;
		for(int i=1;i<=k && n-i>=0;i++)
		{
          if(ways[n-i]==0)
          {
          	ways[n-i]+=totalWays(n-i,k);
          }
          way+=ways[n-i];
		}
		return way;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		System.out.println(totalWays(n,k));
	}
}