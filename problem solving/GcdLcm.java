import java.util.*;
class GcdLcm
{
	public static void main(String args[])
	{
		int a1,a2,gcd=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number that you want Gcd");
		a1=in.nextInt();
		a2=in.nextInt();
		System.out.print("Your input is-:"+a1+" "+a2);
		System.out.println();

		for(int i=1;i<=a1 && i<=a2;i++)
		{
			if(a1%i==0 && a2%i==0)
			{
              gcd=i;
			}
		}
       int lcm=(a1*a2)/gcd;
		System.out.println("Gcd of"+" "+a1+" "+"and"+" "+a2+" "+"are:-"+" "+gcd);
		System.out.println("Lcm:-"+lcm);
	}
}