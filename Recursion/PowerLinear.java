import java.util.*;
class PowerLinear
{
	static int power(int x,int n)
	{
		if(n==0)
			return 1;
		int xnm1=power(x,n-1);
		int xn=x*xnm1;
		return xn;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int n=in.nextInt();
		System.out.println(PowerLinear.power(x,n));
	}
}