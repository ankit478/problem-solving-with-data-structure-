import java.util.*;
class SelectionSort
{
	static void sort(int arr[])
	{
        int min,pos;
        for(int i=0;i<=arr.length-2;i++)
        {
        	min=arr[i];
        	pos=i;
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[j]<min)
        		{
        			min=arr[j];
        			pos=j;
        		}
        	}
        	int help =arr[i];
        	arr[i]=arr[pos];
        	arr[pos]=help;
        }
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Array before sorting:-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		sort(arr);
		System.out.println("Array after sorting:-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}


	}
}