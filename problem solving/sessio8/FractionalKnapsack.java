import java.io.*;
import java.util.*;
class Item
{
  int val,weight;
  double cost;
  Item(int weight,int val)
  {
    this.weight=weight;
    this.val=val;
    cost = (double) val / (double) weight;
  }
};
class myComparator implements Comparator<Item>
{
public int compare(Item o1,Item o2)
{
 return (int)(o2.cost - o1.cost);
}
}
class FractionalKnapsack
{
  static double fractionalKnapsack(int val[], int weight[], int n, int capacity)
  {
    Item arr[]=new Item[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=new Item(weight[i],val[i]);
    }
     Arrays.sort(arr,new myComparator());
     int curweight=0;
    double finalval=0.0;
    for(int i=0;i<n;i++)
    {
      if(curweight + arr[i].weight <=capacity)
      {
        curweight+=arr[i].weight;
        finalval+=arr[i].val;
      }
      else
      {
        int remain=capacity - curweight;
        finalval+= remain*((double)arr[i].val/arr[i].weight);
        break;
      }
      
    }
    return finalval;

  }
 
  public static void main(String args[]) throws IOException
  {
    Scanner in=new Scanner(System.in);
    int val[]={25,24,15};
    int weight[]={18,15,10};
   /* int val[]=new int[n];
    int weight[]=new int[n];
    for(int i=0;i<n;i++)
    {
      val[i]=in.nextInt();
    }
     for(int i=0;i<n;i++)
    {
      weight[i]=in.nextInt();
    }*/
    int n=weight.length;
    int capacity=20;
    System.out.println(fractionalKnapsack(val,weight,n,capacity));
  }
  }