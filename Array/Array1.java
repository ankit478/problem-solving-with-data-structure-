import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		int num[]=new int[100];
		int size;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=in.nextInt();
		System.out.println("now enter the values for array");
		for(int i=0;i<size;i++)
		{
		
			num[i]=in.nextInt();
		}
		System.out.println("Your array is");
		for(int i=0;i<size;i++)
		{
           System.out.println("value of index"+i+"="+num[i]);
		}		

	}
}
