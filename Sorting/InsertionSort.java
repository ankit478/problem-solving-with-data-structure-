import java.util.*;
class InsertionSort
{
	static void sort(int arr[])
	{
		int item;
		for(int i=1;i<arr.length;i++)
		{
			item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
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