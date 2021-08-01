import java.util.*;
class SubSequence1
{
	static void getSubSequence(String str1,String str2)
	{
		if(str1.length()==0)
		{
			System.out.println(str2);
			return;
		}
		char ch=str1.charAt(0);
		String remain=str1.substring(1);
		getSubSequence(remain,str2+ch);
		getSubSequence(remain,str2+"");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		getSubSequence(str1,"");

	}
}