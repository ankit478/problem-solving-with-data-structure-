import java.util.*;
class Encoding
{
	static void getEncode(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.print("  "+ans);
			return;
		}
		else if(ques.length()==1)
		{
			char ch=ques.charAt(0);
			if(ch=='0')
			{
				return;
			}
			else
			{
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				ans=ans+code;
				System.out.print("  "+ans);
			}
		}
		else
		{
			char ch1=ques.charAt(0);
			String remain=ques.substring(1);
			if(ch1=='0')
			{
				return;
			}
			else
			{
			int ch1v=ch1-'0';
			char code =(char)('a'+ch1v-1);
			getEncode(remain,ans+code);
		     }

		     String ch12=ques.substring(0,2);
		     String remain1=ques.substring(2);
		     int ch12v=Integer.parseInt(ch12);
		     if(ch12v <= 26)
		     {
		     char code=(char)('a'+ch12v-1);
		     getEncode(remain1,ans+code);
		 }
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String ques=in.next();
		getEncode(ques,"");
	}
}