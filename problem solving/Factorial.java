import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int n,fact=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}