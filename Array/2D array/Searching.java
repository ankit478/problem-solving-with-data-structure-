import java.util.*;
class Searching
{
	static void search(int arr[][],int key)
	{
		int i=0;
		int j=arr[0].length-1;

		while(i<arr.length && j>=0)
		{
			if(key==arr[i][j])
			{
				System.out.println(i+"  "+j);
				return;
			}
			else if(key>arr[i][j])
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		System.out.println("Item not found");

	}
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("enter key");
		int key=in.nextInt();
		search(arr,key);
}
}