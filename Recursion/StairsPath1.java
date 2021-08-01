import java.util.*;
class StairsPath1
{
	static void getPath(int n,String path)
	{
		if(n<0)
		{
			return;
		}
		if(n==0)
		{
			System.out.print("  "+path);
			return;
		}
		getPath(n-1,path+"1");
		getPath(n-2,path+"2");
		getPath(n-3,path+"3");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		getPath(n,"");
	}
}