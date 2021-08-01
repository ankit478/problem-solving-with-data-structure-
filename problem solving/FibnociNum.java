import java.util.*;
class FibnociNum
{
	static int fibNum(int n,int m)
	{
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<n-1;i++)
		{
			//System.out.println(a);
			c=a+b;
			a=b;
			b=c;

		}
		int result=c%m;
		return result;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		FibnociNum f=new FibnociNum();
		System.out.println(fibNum(n,m));
	}
}