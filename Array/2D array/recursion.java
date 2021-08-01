import java.util.*;
class recursion
{
	static void printDecreasing(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		printDecreasing(n-1);

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		recursion.printDecreasing(n);
	}
}