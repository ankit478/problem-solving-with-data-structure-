import java.util.*;
class SequentialSearch2
{
  public static void main(String args[])
  {
  	int num[]= {12,34,45,6,13};

  	SequentialSearch2 s = new SequentialSearch2();
  	int i = s.searchIndex(num,34);
  	if(i==-1)
  	{
  		System.out.println("value dosent exist");
  	}
  	else
  	{
  		System.out.println(i);
  	}
  }
  public int searchIndex(int num[],int val)
  {
     if(num.length==0)
     {
     	return -1;
     }
     else
     {
     	for(int i=0;i<num.length;i++)
     	{
     		if(num[i]==val)
     		{
     			return i;
     		}
     	}
     }
     return -1;
  }
}