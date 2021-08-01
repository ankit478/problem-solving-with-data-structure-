import java.util.*;
class DecreaseIncrease
{
	static void getElement(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		getElement(n-1);
		if(n==1)
			System.out.println();
		System.out.print(n+" ");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		DecreaseIncrease.getElement(n);
	}
}