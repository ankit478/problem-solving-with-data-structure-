import java.util.*;
class DiagonalTraversal
{
	static void traversal(int arr[][])
	{
		for(int g=0;g<arr.length;g++)
		{
			for(int i=0,j=g;j<arr[0].length;i++,j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
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
		System.out.println("after diagonal:-");
		traversal(arr);
	}
}