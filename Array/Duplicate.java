import java.util.*;
class Duplicate
{
	public static void main(String args[])
	{
		int num[]=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values in array:-");
		for(int i=0;i<num.length;i++)
		{
			num[i]=in.nextInt();
		}
		System.out.println("Duplicate element in given array is:-");
		for(int i=0;i<num.length;i++)
		{
            for(int j=i+1;j<num.length;j++)
            {
            	if(num[i]==num[j])
            	{
            		System.out.println(num[i]);
            	}
            }
		}
	}
}