import java.util.*;
class Power
{
	static int pow(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}

		return x*pow(x,n-1);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int n=in.nextInt();
		System.out.println(pow(x,n));
	}
}