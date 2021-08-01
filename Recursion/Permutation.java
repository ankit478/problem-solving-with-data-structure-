import java.util.*;
class Permutation
{
	static void getPer(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.print("  "+ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch= ques.charAt(i);
			String left=ques.substring(0,i);
			String right=ques.substring(i+1);
			String remain=left+right;
			getPer(remain,ans+ch);
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String ques=in.next();
		getPer(ques,"");
	}
}