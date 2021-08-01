import java.util.*;
class Keypad1
{
	static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	static void getKPC(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(" "+ans);
			return;
		}
		char ch=ques.charAt(0);
		String remain=ques.substring(1);

		String first=codes[ch-'0'];
		for(int i=0;i<first.length();i++)
		{
			char chcode=first.charAt(i);
			getKPC(remain,ans+chcode);
		}

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String ques=in.next();
		getKPC(ques,"");
	}
}