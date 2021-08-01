import java.util.*;
class MazePathWithJump1
{
	static void getMaze(int sr,int sc,int dr,int dc,String path)
	{
		if(sr==dr && sc==dc)
		{
			System.out.print("  "+path);
			return;
		}
		for(int ms=1;ms<=dc-sc;ms++)
		{
			getMaze(sr,sc+ms,dr,dc,path+"h"+ms);
		}
		for(int ms=1;ms<=dr-sr;ms++)
		{
			getMaze(sr+ms,sc,dr,dc,path+"v"+ms);
		}
		for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++)
		{
			getMaze(sr+ms,sc+ms,dr,dc,path+"d"+ms);
		}

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int dr=in.nextInt();
		int dc=in.nextInt();
		getMaze(1,1,dr,dc,"");
	}
}