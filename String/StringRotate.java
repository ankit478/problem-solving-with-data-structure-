import java.util.*;
import java.lang.*;
class StringRotate
{
	public static void main(String args[])
	{

		String str1="hello";
		String str2="hillo";
		if(str1.length()!=str2.length())
		{
			System.out.println();
		}
		str1=str1.concat(str1);
		System.out.println(str1);
		if(str1.contains(str2))
		{
			System.out.println("String are rotation of each other");
		}
	}
}