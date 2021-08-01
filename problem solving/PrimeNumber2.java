import java.util.*;
class PrimeNumber2
{
	public static void main(String args[])
	{
		int num;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(int i=0;i<num;i++)
		{
			int n=in.nextInt();
			int count=0;
			for(int div=2;div*div<=n;div++)
			{
				if(n%div==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}
		

	}
}