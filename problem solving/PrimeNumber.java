import java.util.*;
class PrimeNumber
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
			for(int div=1;div<=n;div++)
			{
				if(n%div==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n+"is prime number");
			}
			else
			{
				System.out.println("Not prime");
			}
		}
		

	}
}