import java.util.*;
class SpiralTraversal
{
	static void getArray(int arr[][],int n,int m)
	{
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int total=n*m;
		int count=0;
		System.out.println("After spiral Traversal:-");
		while(count<total)
		{
			//leftwall
			for(int i=minr, j=minc; i<=maxr && count<total;i++)
			{
				System.out.print(arr[i][j]+" ");
				count++;
			}
			System.out.println();
			minc++;
			//bottomwall
			for(int i=maxr, j=minc; j<=maxc && count<total;j++)
			{
            System.out.print(arr[i][j]+" ");
            count++;
			}
			System.out.println();
			maxr--;
			//rightwall
			for(int i=maxr, j=maxc; i>=minr && count<total; i--)
			{
				System.out.print(arr[i][j]+" ");
				count++;
			}
			System.out.println();
			maxc--;
			//topwall
			for(int i=minr, j=maxc;j>=minc && count<total;j--)
			{
				System.out.print(arr[i][j]+" ");
				count++;
			}
			System.out.println();
			minr++;
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
         SpiralTraversal.getArray(arr,n,m);
	}
}