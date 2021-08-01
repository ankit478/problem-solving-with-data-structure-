import java.util.*;
class PowerLogerathmic
{
	static int pow(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int xpb1=pow(x,n/2);
		int xn=xpb1*xpb1;

		if(n%2==1)
			xn=xn*x;
		return xn;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int n=in.nextInt();
		System.out.println(pow(x,n));
	}
}