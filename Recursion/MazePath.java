import java.util.*;
import java.io.*;
class MazePath
{
	static ArrayList<String> getMaze(int sr,int sc,int dr,int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		ArrayList<String> hpath=new ArrayList<>();
		ArrayList<String> vpath=new ArrayList<>();
		if(sc<dc)
		{
			 hpath=getMaze(sr,sc+1,dr,dc);
		}
		if(sr<dr)
		{
			 vpath=getMaze(sr+1,sc,dr,dc);
		}
		ArrayList<String> path=new ArrayList<>();
		for(String paths:hpath)
		{
			path.add("h"+paths);
		}
		for(String paths:vpath)
		{
			path.add("v"+paths);
		}
		return path;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);;
		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println(getMaze(1,1,n,m));
	}
}