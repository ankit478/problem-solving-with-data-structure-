import java.util.*;
class PrintIncreasing
{
	static void printincrease(int n)
	{
		if(n==0)
			return;
		printincrease(n-1);
		System.out.print(n+" ");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		printincrease(n);
	}
}