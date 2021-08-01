import java.util.*;
import java.lang.*;
class FindUnique
{
	static int unique(String str)
	{
		int n=str.length();
		int count[]=new int[26];
		for(int i=0;i<n;i++)
		{
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<n;i++)
		{
			if(count[str.charAt(i)-'a']==1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(unique(str));
	}
}