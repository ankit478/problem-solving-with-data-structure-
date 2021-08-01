import java.util.*;
class ZigZag
{
	static void Print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n+" ");
		Print(n-1);
		System.out.print(n+" ");
		Print(n-1);
		System.out.print(n+" ");

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Print(n);
	}
}