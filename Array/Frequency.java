import java.util.*;
class Frequency
{
	public static void main(String args[])
	{
		int num[]=new int[10];
		int fr[]=new int[num.length];
		int visited=-1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the values for array:-");
		for(int i=0;i<num.length;i++)
		{
			num[i]=in.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			int count=1;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
			{
                fr[i]=count;
			}
		}
		System.out.println("Element | Frequency");
		System.out.println("--------------------");

		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visited)
			{
				System.out.println(" "+num[i]+" | "+fr[i]);
			}
		}
	}
}