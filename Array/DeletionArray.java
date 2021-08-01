//array program for deletion.
import java.util.*;
class DeletionArray
{
	public static void main(String args[])
	{
		int num[]=new int[100];
		int size,pos;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size for array");
		size=in.nextInt();
		System.out.println("enter values for array");
		for(int i=0;i<size;i++)
		{
			num[i]=in.nextInt();
		}
		System.out.println("your array is:-");
		for(int i=0;i<size;i++)
		{
			System.out.println("value of"+i+" index="+num[i]);
		}
		System.out.println("enter the position where you want to delete");
		pos=in.nextInt();
		if(pos<0 || pos>size)
		{
			System.out.println("invalid position");
		}
		else
		{
			for(int i=pos;i<size;i++)
			{
				num[i]=num[i+1];
			}
			size--;
			System.out.println("updated array:-");
			for(int i=0;i<
				size;i++)
			{
				System.out.println(num[i]);
			}
		}

	}
}