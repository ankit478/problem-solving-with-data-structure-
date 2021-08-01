import java.util.*;
import java.lang.*;
class CountFrequency
{
	static void frequency(String str)
	{
		int n=str.length();
	    int count[]=new int[26];
        for(int i=0;i<n;i++)
        {
          count[str.charAt(i)- 'a']++;
        
        }
        for(int i=0;i<n;i++)
        {
        	if(count[str.charAt(i)- 'a']!=0)
        	{
        		System.out.print(str.charAt(i));
        		System.out.print(count[str.charAt(i)- 'a']);
        		count[str.charAt(i)- 'a']=0;
        	}
        }

	} 
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		CountFrequency.frequency(str);
	}
}