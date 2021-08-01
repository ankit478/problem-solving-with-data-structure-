import java.util.*;
import java.io.*;
class MazePathWithJump
{
	static ArrayList<String> getMaze(int sr,int sc,int dr,int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		ArrayList<String> path=new ArrayList<>();
		for(int ms=1;ms<=dc-sc;ms++)
		{
			ArrayList<String> hpath=getMaze(sr,sc+ms,dr,dc);
			for(String paths:hpath)
			{
				path.add("h"+ms+paths);
			}
		}
		for(int ms=1;ms<=dr-sr;ms++)
		{
			ArrayList<String> vpath=getMaze(sr+ms,sc,dr,dc);
			for(String paths:vpath)
			{
				path.add("v"+ms+paths);
			}
		}
		for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++)
		{
			ArrayList<String> dpath=getMaze(sr+ms,sc+ms,dr,dc);
			for(String paths:dpath)
			{
				path.add("d"+ms+paths);
			}
		}
		return path;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println(getMaze(1,1,n,m));
	}
}