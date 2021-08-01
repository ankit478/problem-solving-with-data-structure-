import java.util.*;
class PrimeNum
{
	static int primeNumber(int low,int high)
	{
		for(int n=low;n<=high;n++)
		{
			int count=0;
			for(int div=2; div*div<=n;div++)
			{
				if(n%div==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(n);
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int low=in.nextInt();
		int high=in.nextInt();
		PrimeNum p=new PrimeNum();
		p.primeNumber(low,high);
	}
}