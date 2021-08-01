import java.util.*;
class KnightTour
{
	static void printKnight(int chess[][],int r,int c,int move)
	{
		if(r<0 || c<0 ||r>=chess.length || c>=chess.length ||chess[r][c]>0)
		{
			return;
		}
		else if(move==chess.length * chess.length)
		{
			chess[r][c]=move;
			display(chess);
			chess[r][c]=0;
			return;
		}
		chess[r][c]=move;
		printKnight(chess,r-2,c+1,move+1);
		printKnight(chess,r-1,c+2,move+1);
		printKnight(chess,r+1,c+2,move+1);
		printKnight(chess,r+2,c+1,move+1);
		printKnight(chess,r+2,c-1,move+1);
		printKnight(chess,r+1,c-2,move+1);
		printKnight(chess,r-1,c-2,move+1);
		printKnight(chess,r-2,c-1,move+1);
		chess[r][c]=0;
	}
	static void display(int chess[][])
	{
		for(int i=0;i<chess.length;i++)
		{
			for(int j=0;j<chess[0].length;j++)
			{
				System.out.print(chess[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int r=in.nextInt();
		int c=in.nextInt();
		int chess[][]=new int[n][n];
		printKnight(chess,r,c,1);
	}
}
