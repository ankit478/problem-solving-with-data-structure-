import java.util.*;
class TargetSumSubset
{
	static void getSubset(int arr[],int idx,String set,int prefix,int sum)
	{
		if(prefix>sum)
		{
			return;
		}

		if(idx==arr.length)
		{
			if(prefix==sum)
			{
				System.out.println(set);
				return;
			}
			return;
		}
		if(prefix == sum)
		{
			System.out.println(set);
			return;
		}
	 getSubset(arr,idx+1,set+arr[idx]+",",prefix+arr[idx],sum);
	 getSubset(arr,idx+1,set,prefix,sum);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		int sum=in.nextInt();
		getSubset(arr,0,"",0,sum);
	}
}