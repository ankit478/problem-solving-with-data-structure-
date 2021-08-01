//problem-1 check which bit is on or which bit is off and which bit is toggled and check which bit is on.
import java.util.*;
class Bit1
{
	static void Check(int n,int i,int j,int k,int m)
	{
        System.out.println((n|1<<i));
        System.out.println(n & ~(1<<j));
        System.out.println(n ^ 1<<k);
        System.out.println((n & 1<<m)==0?false:true);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=in.nextInt();
		int j=in.nextInt();
		int k=in.nextInt();
		int m=in.nextInt();
		Bit1.Check(n,i,j,k,m);
	}
}