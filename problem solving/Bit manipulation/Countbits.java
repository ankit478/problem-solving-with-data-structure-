//problem- find how many Sets bits are there.
import java.util.*;
class Countbits
{
	static int getBits(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n & n-1;
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