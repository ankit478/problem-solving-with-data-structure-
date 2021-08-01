import java.util.*;
class NQueens
{
	static void printNQ(int chess[][],String qsf,int row)
	{
		if(row==chess.length)
		{
			System.out.println(qsf);
			return;
		}
		//put the queens
		for(int col=0;col<chess.length;col++)
		{
			if(isPlaceSafe(chess,row,col)==true)
			{
				chess[row][col]=1;
				printNQ(chess,qsf+row+"-"+col+",",row+1);
				chess[row][col]=0;
			}
		}
	}
	public static boolean isPlaceSafe(int chess[][],int row,int col)
	{
		for(int i=row-1,j=col;i>=0;i--)
		{
			if(chess[i][j]==1)
			{
				return false;
			}
		}
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
		{
			if(chess[i][j]==1)
			{
				return false;
			}
		}
		for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++)
		{
			if(chess[i][j]==1)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int chess[][]=new int[n][n];
		printNQ(chess,"",0);
	}
}