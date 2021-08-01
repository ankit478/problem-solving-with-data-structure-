//problem 4- Joseph problem solution.
import java.util.*;
class Joseph
{
	static int getPow(int n)
	{
		int i=1;
		while(i*2<=n)
		{
			i=i * 2;
		}
		return i;
	}
	static int getResult(int n)
	{
      int hp=getPow(n);
      int l=n-hp;
      int res= 2*l + 1;
      return res;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(getResult(n));
	}
}