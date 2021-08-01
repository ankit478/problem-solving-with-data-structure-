import java.util.*;
class FloodFill
{
	static void floodFill(int maze[][],int sr,int sc,String path,boolean visited[][])
	{
		if(sr<0 ||sc<0 ||sr==maze.length ||sc==maze[0].length ||maze[sr][sc]==1 ||visited[sr][sc]==true)
			{
				return;
			}
			if(sr==maze.length-1 && sc==maze[0].length-1)
			{
				System.out.println(path);
				return;
			}

			visited[sr][sc]=true;
			//call for top
			floodFill(maze,sr-1,sc,path+"t",visited);
			//call for left
			floodFill(maze,sr,sc-1,path+"l",visited);
			//call for down
			floodFill(maze,sr+1,sc,path+"d",visited);
			//call for right
			floodFill(maze,sr,sc+1,path+"r",visited);
			visited[sr][sc]=false;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print("  "+arr[i][j]);
			}
			System.out.println();
		}
		boolean visited[][]=new boolean[n][m];
		floodFill(arr,0,0,"",visited);
	}
}