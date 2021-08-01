//problem- you have to find right most set bit mask;
import java.util.*;
class Rsb
{
	static void getRsb(int n)
	{
		int rsb=n & -n;
		System.out.println(Integer.toBinaryString(rsb));
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Rsb.getRsb(n);

	}
}