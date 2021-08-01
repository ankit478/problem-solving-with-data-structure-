import java.util.*;
class DisplayArray
{
	static void display(int arr[],int idx)
	{
		if(idx==arr.length)
			return;
		System.out.print(arr[idx]+" ");
		display(arr,idx+1);
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