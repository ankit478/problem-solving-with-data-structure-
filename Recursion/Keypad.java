import java.util.*;
import java.io.*;
class Keypad
{
	static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

	static ArrayList<String> getKPC(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		char ch=str.charAt(0);
		String remain=str.substring(1);
		ArrayList<String> rrs=getKPC(remain);
		ArrayList<String> mrs=new ArrayList<>();
		String first=codes[ch-'0'];
		for(int i=0;i<first.length();i++)
		{
			char chcode=first.charAt(i);
			for(String rstr:rrs)
			{
				mrs.add(chcode+rstr);
			}
		}
		return mrs;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		System.out.println(getKPC(str));
	}
}