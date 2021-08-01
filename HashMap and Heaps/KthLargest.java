import java.util.*;
import java.io.*;
class KthLargest
{
	 static void elements(int arr[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
         if(i < k)
         {
             pq.offer(arr[i]);
         }
         else
         {
             if(arr[i]>pq.peek())
             {
                 pq.remove();
                 pq.add(arr[i]);
             }
         }
            
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