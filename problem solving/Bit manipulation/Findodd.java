//problem2- Find odd man out
import java.util.*;
class Findodd
{
	static int getOdd(int arr[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			res=res^arr[i];
		}
		return res;
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
		System.out.println(getOdd(arr,n));
	}
}