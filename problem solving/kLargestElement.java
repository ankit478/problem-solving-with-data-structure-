import java.util.*;
import java.io.*;
class kLargestElement
{
	static void element(int arr[],int n,int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Mycomparator());
		for(int i=0;i<n;i++)
		{
            pq.offer(arr[i]);
		}
		int j=1;
		while(j<=k)
		{
			System.out.println(pq.poll());
			j++;
		}
	}
	public static void main(String args[]) throws IOException
	{
		int arr[]={2,56,3,87,42,1,45,8,2,98};
		int n=arr.length;
		int k=3;
		kLargestElement.element(arr,n,k);
	}
}
class Mycomparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}