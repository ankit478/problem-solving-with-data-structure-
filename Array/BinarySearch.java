 import java.util.*;
class BinarySearch
{
  public static void main(String args[])
  {
    int num[]=new int[100];
    int size;
    int val;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the size for array");
    size=in.nextInt();
    System.out.println("enter the values for array:-");
    for(int i=0;i<size;i++)
    {
         num[i]=in.nextInt();
    }
    System.out.println("your array is:-");
    for(int i=0;i<size;i++)
    {
      
      System.out.println("index:-"+i+"="+num[i]); 
    }
      for(int i=0;i<size;i++)
      {
        for(int j=i+1;j<size;j++)
        {
          if(num[i]>=num[j])
          {
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
          }
        }
      }
       System.out.println("your sorted array is:-");
       for(int i=0;i<size;i++)
    {
      
      System.out.println("index:-"+i+"="+num[i]); 
    }
    int low=0,high=size-1;
     int a=low+high;
    int mid=a/2;

      System.out.println("enter the value that you want to search");
      val=in.nextInt();
    if(num.length==0)
    {
      System.out.println("no element present now");
    }
   else if(num.length>0)
    {
      while(num[mid]!=val && low<=high)
      {
        if(val<num[mid])
        {
          high=mid-1;
        }
        else
          {
            low=mid+1;
          }
         mid=(low+high)/2;  
      }
    }

   if(num[mid]==val)
    {
      System.out.println("element found that index is="+mid+"and value="+num[mid]);
    }
    else
    {
      System.out.println("value doesnt exist");
    }

  }
}