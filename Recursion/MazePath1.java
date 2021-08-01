import java.util.*;
class MazePath1
{
	static void getMaze(int sr,int sc,int dr,int dc,String path)
	{
		if(sr>dr || sc>dc)
		{
			return;
		}
		if(sr==dr && sc==dc)
		{
			System.out.println("  "+path);
			return;
		}
			getMaze(sr+1,sc,dr,dc,path+"v");
			getMaze(sr,sc+1,dr,dc,path+"h");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int dr=in.nextInt();
		int dc=in.nextInt();
		getMaze(1,1,dr,dc,"");
	}
}