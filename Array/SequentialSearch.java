import java.util.*;
class SequentialSearch
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
    	System.out.println("enter the value that you want to search");
     	val=in.nextInt();
		if(num.length==0)
		{
			System.out.println("no element present now");
		}
		else if(num.length>0)
		{
			for(int i=0;i<num.length;i++)
			{
				if(num[i]==val)
				{
					System.out.println("element found that index is="+i+"and value="+num[i]);
				}
			}
		}
		else
		{
			System.out.println("value doesnt exist");
		}

	}
}