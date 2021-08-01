import java.util.*;

class Array2
{
	int count=0;
	public static void main(String args[])
	{
		Array2 a=new Array2();

		int num[]=new int[5];
		for(int i=0;i<num.length;i++)
		{
			a.insert(num,i);
		}
		a.print(num);
		
	}
	public void insert(int num[], int val)
	{
		num[count++]=val;
	}
	public void print(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}