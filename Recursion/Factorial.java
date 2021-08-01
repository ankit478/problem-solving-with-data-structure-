import java.util.*;
class Factorial
{
	static int getFact(int n)
	{
		if(n==1)
			return 1;
		int fct1=getFact(n-1);
		int fn=n*fct1;
		return fn;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(Factorial.getFact(n));
	}
}