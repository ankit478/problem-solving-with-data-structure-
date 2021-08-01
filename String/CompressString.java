import java.util.*;
import java.lang.*;
class CompressString
{
	static String compress(String str)
	{
	
		int n=str.length();
		String res="";
		int j=0;
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			res+=str.charAt(i);
			j++;
			while(i+1<n && str.charAt(i)==str.charAt(i+1))
	        {
              count++;
              i++;
			}
			
			
				String str2=Integer.toString(count);
				res+=str2;
			
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(compress(str));
	}
		
	
}