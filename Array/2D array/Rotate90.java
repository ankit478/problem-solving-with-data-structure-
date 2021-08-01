import java.util.*;
class Rotate90
{
	static void rotate(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[0].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int li=0;
			int ri=arr[i].length-1;
			while(li<ri)
			{
				int help=arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=help;
				li++;
				ri--;
			}
		}
		display(arr);
	}
	static void display(int arr[][])
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
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
		System.out.println("before rotation");
		for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println("before rotation");
		     rotate(arr);
		}
}