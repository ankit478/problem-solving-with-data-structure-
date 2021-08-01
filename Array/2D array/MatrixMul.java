import java.util.*;
class MatrixMul
{
	static void getArray(int one[][],int two[][],int r1,int c1,int r2,int c2)
	{
		if(c1!=r2)
		{
			System.out.println("invalid array input");
		}
		int prd[][]=new int[r1][c2];
		for(int i=0;i<prd.length;i++)
		{
			for(int j=0;j<prd[0].length;j++)
			{
				for(int k=0;k<c1;k++)
				{
					prd[i][j]+=one[i][k] * two[k][j];
				}
			}
		}
		for(int i=0;i<prd.length;i++)
		{
			for(int j=0;j<prd[0].length;j++)
			{
			  System.out.print(prd[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		int one[][]=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				one[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(one[i][j]+" ");
			}
			System.out.println();
		}
		int r2=in.nextInt();
		int c2=in.nextInt();
		int two[][]=new int[r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				two[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(two[i][j]+" ");
			}
			System.out.println();
		}
		MatrixMul.getArray(one,two,r1,c1,r2,c2);
	}
}
