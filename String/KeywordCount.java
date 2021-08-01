import java.util.*;
import java.lang.*;
class KeywordCount
{
	static int keywordCount(String str, String word)
	{
		int count=0;
		int n=str.length();
		int m=word.length();
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)!=' ')
			{
				int flag=0;
				for(int j=0;j<m;j++)
				{
					if(str.charAt(i)==word.charAt(j))
					{
						i++;
					}
					else
					{
						flag=1;
						break;
					}
					
				}
				if(flag==0 && (i==n || str.charAt(i)==' '))
				{
					count++;
				}
				else
				{
					while(i<n && str.charAt(i)!=' ')
					{
						i++;
					}
				}

			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String word=in.nextLine();
		System.out.println(keywordCount(str,word));
		 
	}
}