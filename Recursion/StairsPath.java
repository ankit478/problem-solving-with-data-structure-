import java.util.*;
import java.io.*;
class StairsPath
{

	static ArrayList<String> getStairs(int n)
	{
		if(n==0)
		{
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		else if(n<0)
		{
			ArrayList<String> bs=new ArrayList<>();
			return bs;
		}
		ArrayList<String> paths1=getStairs(n-1);
		ArrayList<String> paths2=getStairs(n-2);
		ArrayList<String> paths3=getStairs(n-3);
		ArrayList<String> path=new ArrayList<>();
		for(String paths:paths1)
		{
			path.add(1+paths);
		}
		for(String paths:paths2)
		{
			path.add(2+paths);
		}
		for(String paths:paths3)
		{
			path.add(3+paths);
		} 
         return path;


	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		StairsPath n=new StairsPath();
		System.out.println(getStairs(n));

	}
}