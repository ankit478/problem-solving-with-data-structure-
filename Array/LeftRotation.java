import java.util.*;
class LeftRotation
{
	public static void main(String args[])
	{
		int num[]=new int[5];
		int num2[]=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values for Array:-");
		for(int i=0;i<num.length;i++)
		{
			num[i]=in.nextInt();
		}
		
		System.out.println("your original array is:-");
		for(int i=0; i<num.length;i++)
		{
			System.out.print("     "+num[i]);
		}
		System.out.println();
		int rotation;
		System.out.println("enter the number from where you want to left rotate:-");
		rotation=in.nextInt();
		for(int i=0;i<rotation;i++)
		{

			int j,first;
			first=num[0];
			for( j=0;j<num.length-1;j++)
			{
				num[j]=num[j+1];
			}
			num[j]=first;
		}
		System.out.println("Array after left rotation");
		for(int i=0; i<num.length;i++)
		{
			System.out.println("  "+num
				[i]);
		}
	}
}