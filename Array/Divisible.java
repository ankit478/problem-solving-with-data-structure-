 import java.util.*;
class Divisible
{
  public static void main(String args[])
  {
    int num[]=new int[1000];
    int count=0,count1=0,count2=0;
    System.out.println("enter the values for array:-");
    for(int i=0;i<num.length;i++)
    {
         num[i]=i+1;
    }
    System.out.println("number divisible by 3 and 7 are:-");
    for(int i=0;i<1000;i++)
    {
      if(num[i]%3==0 && num[i]%7==0)
      {
        count++;
        System.out.println(""+num[i]);
      }
    }
    System.out.println("Total number divisible by 7 and 11 are:-");
      for(int j=0;j<1000;j++)
      {
     if(num[j]%7==0 && num[j]%11==0)
      {
        count1++;
        System.out.println(""+num[j]);
      }
    }
     System.out.println("Total number divisible by3,7 and 11 are:-");
    for(int k=0;k<1000;k++)
    {
       if(num[k]%3==0 && num[k]%7==0 && num[k]%11==0)
       {
        count2++;
        System.out.println(""+num[k]);
         
       }
     }

      
      

      }
    }
    


