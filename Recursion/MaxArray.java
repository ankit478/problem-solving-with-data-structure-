import java.util.*;
class MaxArray
{
	static int Max(int arr[],int idx)
	{
		if(idx==arr.length-1)
			return arr[idx];
		int misa=Max(arr,idx+1);
		if(misa>arr[idx])
		{
			return misa;
		}
		else
		{
			return arr[idx];
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println(Max(arr,0));
	}
}