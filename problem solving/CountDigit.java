import java.util.*;
class CountDigit
{
	static int countDig(int n)
	{
		int dig=0;
		while(n!=0)
		{
			n=n/10;
			dig++;
		}
		return dig;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(countDig(n));
	}
}