import java.util.*;
import java.io.*;
class FindPair
{
  static int getPairsCount(int arr[], int n, int sum){
    int count=0;
    int l=0,r=arr.length-1;
    while(l<r)
    {
      if(arr[l]+arr[r]==sum)
      {
        count++;
        l++;
        r--;
      }
      else if(arr[l]+arr[r]>sum)
        r--;
      else
        l++;
    }
    return count;
	
  }
  public static void main(String args[])
  {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int n=arr.length;
    int sum=11;
    System.out.println(getPairsCount(arr,n,sum));
  }
}