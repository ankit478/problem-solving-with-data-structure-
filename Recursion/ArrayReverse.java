import java.util.*;
class ArrayReverse
{
	static void display(int arr[],int idx)
	{
		if(idx==arr.length)
			return;
		display(arr,idx+1);
		System.out.print(arr[idx]+" ");
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
		display(arr,0);
	}
}