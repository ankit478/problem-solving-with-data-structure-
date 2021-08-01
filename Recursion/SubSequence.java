import java.util.*;
import java.io.*;
class SubSequence
{
	static ArrayList<String> getSub(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		char ch=str.charAt(0);
		String remain=str.substring(1);
		ArrayList<String> rrs=getSub(remain);
		ArrayList<String> mrs=new ArrayList<>();
		for(String rstr:rrs)
		{
			mrs.add(""+rstr);
			mrs.add(ch+rstr);
		}
		return mrs;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		System.out.println(getSub(str));
	}
}