import java.util.*;
import java.lang.*;
class StringEx
{
	public static void main(String args[])
	{
	String s="Hello";
	char ch[]={'B','R','O'};
	String s2=new String(ch);
	System.out.println(s);
	System.out.println(s2);
	System.out.println("char at index 4 is"+" "+s.charAt(4));
	for(int i=0;i<s.length();i++)
	{
		System.out.println("char at index"+i+" "+s.charAt(i));
	}
	String s3="javatpoint welcome";
	int count=0;
	for(int i=0;i<s3.length();i++)
	{
		if(s3.charAt(i)=='t')
		{
			count++;
		}
	}
	System.out.println("Frequency of char T is:-"+count);
	String str1="hello";
	String str2="kaise Ho";
	String str3=str4.concat(str1).concat(" ").concat(str2);
}
}