import java.util.*;
class MulArray
{
	public static void main(String args[])
	{
		int num[]=new int[6];
		int num1[]=new int[6];
		int mul[]= new int[6];
		int mul1[]=new int[6];
		for(int i=1;i<num.length;i++)
		{
          num[i]=i; 
          num1[i]=i;
		}
		System.out.println(" arrays are:-");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" "+num[i]);
		}
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" "+num1[i]);
		}
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			mul[i]=num[i]*num1[i];
		}
		System.out.println("After multiplication array:-");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" "+mul[i]);
		}
		System.out.println();
        int max=mul[0];
        for(int i=1;i<mul.length;i++)
        {
        	if(mul[i]>max)
        	{
        		max=mul[i];
        	}
        }
        System.out.println("maximum element in multiplication:-"+max);
	}
}