import java.util.*;
class Intro
{
	static void getArray(int arr[][])
	{
	  for(int i=0;i<arr.length;i++)
	  {
	  	for(int j=0;j<arr[i].length;j++)
	  	{
          System.out.print(arr[i][j]+" ");
	  	}
	  	System.out.println();
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
		Intro.getArray(arr);
	}
}