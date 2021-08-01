import java.util.*;
class SortArray
{
	static void result(int a[], int n)
	{

	/*	for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();*/
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	public static void main(String args[])
	{
       int a[]={0,0,2,0,1,2};
       int n=a.length;
       SortArray s=new SortArray();
       s.result(a,n);
	}
}