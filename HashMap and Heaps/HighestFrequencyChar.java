import java.util.*;
class HighestFrequencyChar
{
	static char hfc(String str)
	{
		HashMap<Character,Integer> m=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(m.containsKey(ch))
			{
				int of=m.get(ch);
				int nf=of+1;
				m.put(ch,nf);
			}
			else
			{
				m.put(ch,1);
			}
		}
		char mfc=str.charAt(0);
		for(Character key:m.keySet())
		{
			if(m.get(key)>m.get(mfc))
			{
				mfc=key;
			}
		}
		return mfc;

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(hfc(str));
	}
}