//problem3--- you have to find how many set bits are there.
import java.util.*;
class Kaurningham
{
	static int getBits(int n)
	{
		int count=0;
		while(n!=0)
		{
			int rsbm=n & -n;
			n=n - rsbm;
			count++;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(getBits(n));
	}
}