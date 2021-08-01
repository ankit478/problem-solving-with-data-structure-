import java.util.*;
class KthSorted
{
	static void sort(int arr[],int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<=k;i++)
		{
			pq.offer(arr[i]);
		}
		for(int i=k+1;i<arr.length;i++)
		{
			System.out.println(pq.poll());
			pq.add(arr[i]);
		}
		while(pq.size()>0)
		{
			System.out.println(pq.poll());
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
      int k=in.nextInt();
      elements(arr,k);
    }
}
