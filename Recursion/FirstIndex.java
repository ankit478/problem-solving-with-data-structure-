import java.util.*;
class FirstIndex
{
	static int getFirst(int arr[],int idx,int x)
	{
		if(idx==arr.length)
		{
			return -1;
		}
		if(arr[idx]==x)
		{
			return idx;
		}
		else
		{
			int fisso=getFirst(arr,idx+1,x);
			return fisso;
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
		System.out.println(getFirst(arr,0,3));
	}
}