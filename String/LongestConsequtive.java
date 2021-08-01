import java.util.*;
class LongestConsequtive
{
	static int LCS(int arr[],int n)
	{
		Arrays.sort(arr);
		/*for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();*/
		int count=1,res=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1]+1)
			{
				count++;
			}
			else if(arr[i]!=arr[i-1])
			{
				count=1;
			}
			if(count>res)
			{
				res=count;
			}
		}
		return res;

	}
	public static void main(String args[])
	{
		int arr[]={10,101,12,13,11,14,25};
		int n=arr.length;
		System.out.println(LCS(arr,n));
	}
}