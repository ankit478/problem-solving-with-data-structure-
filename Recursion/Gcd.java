import java.util.*;
class Gcd
{
	static int gcd(int n1,int n2)
	{
		if(n1%n2==0)
		{
			return n2;
		}
		int rem=n1%n2;
		n1=n2;
		n2=rem;
		int res =gcd(n1,n2);
		return res;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		System.out.println(gcd(n1,n2));

	}

}