import java.util.*;
class BalancedExp
{
	static boolean balanced(String str)
	{
		Stack<Character> s=new Stack<>();

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				s.push(ch);
			}
			else if(ch==')')
			{
              boolean val=handleClosing(s,'(');
              if(val==false)
              {
              	return false;
              }
			}
			else if(ch=='}')
			{
			  boolean val=handleClosing(s,'{');
              if(val==false)
              {
              	return false;
              }

			}
			else if(ch==']')
			{
			  boolean val=handleClosing(s,'[');
              if(val==false)
              {
              	return false;
              }

			}
		}
		if(s.empty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
     static boolean handleClosing(Stack<Character> s,char opch)
     {
     	if(s.size()==0)
     	{
     		return false;
     	}
     	else if(s.peek()!=opch)
     	{
     		return false;
     	}
     	else
     	{
     		s.pop();
     		return true;
     	}
     } 
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(balanced(str));
		
		

	}
}