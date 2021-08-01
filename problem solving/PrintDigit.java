import java.util.*;
class PrintDigit
{
	static int Dig(int n)
	{
		int nod=0;
		int temp=n;
		while(temp!=0)
		{
			temp=temp/10;
			nod++;

		}
		int div=(int)Math.pow(10,nod-1);

		while(div!=0)
		{
			int q=n/div;
			System.out.println(q);
			n=n%div;
			div=div/10;
		}
		return 0;	

			
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		PrintDigit d=new PrintDigit();
		d.Dig(n);
	}
}