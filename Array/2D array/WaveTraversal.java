import java.util.*;
class WaveTraversal
{
	static void getArray(int arr[][])
	{
		System.out.println("After traversal:-");
      for(int j=0;j<arr[0].length;j++)
      {
      	if(j%2==0)
      	{
      		for(int i=0;i<arr.length;i++)
      		{
      			System.out.print(arr[i][j]+" ");
      		}
      		System.out.println();
      	}
      	else
      	{
      		for(int i=arr.length-1;i>=0;i--)
      		{
      			System.out.print(arr[i][j]+" ");
      		}
      		System.out.println();
      	}
      }  
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		WaveTraversal.getArray(arr);
	}
}