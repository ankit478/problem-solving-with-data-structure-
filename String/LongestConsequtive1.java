import java.util.*;
import java.io.*;
class LongestConsequtive1
{
	static int LCS(int arr[],int n)
	{
		int res=1;
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			h.add(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			int count=1;
         if(!h.contains(arr[i]-1))
         {
           int j=arr[i]+1;
           while(h.contains(j))
           {
           	count++;
           	j++;
           }
           if(count>res)
           {
           	res=count;
           }
         }
		}
		return res;
	}
	public static void main(String args[])
	{
		int arr[]={10,101,12,14,11,13,25};
		int n=arr.length;
		System.out.println(LCS(arr,n));
	}
}