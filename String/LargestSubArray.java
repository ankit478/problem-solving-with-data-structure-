import java.util.*;
import java.io.*;
class LargestSubArray
{
  static void largSubArray(int ar[], int n)
 {
    int count=0,start=-1,end=-1;
    HashMap<Integer,Integer> m=new HashMap<>();
    int prefixsum=0;
    int sum=0;
    m.put(0,-1);
    for(int i=0;i<n;i++)
    {
      prefixsum+=ar[i];
      if(m.containsKey(prefixsum-sum))
      {
        if(i - m.get(prefixsum) > count)
        {
         count=i-m.get(prefixsum);
          start=m.get(prefixsum)+1;
          end=i;
        }
        
      }
      else
      m.put(prefixsum,i);
    }
    if(count>0)
      System.out.println(end);
    else
      System.out.println(-1);
  
  }
  public static void main(String args[])
  {
    int ar[]={11,2,-2,10,1,-4,-7,19};
    int n=ar.length;
    LargestSubArray.largSubArray(ar,n);
  }
}