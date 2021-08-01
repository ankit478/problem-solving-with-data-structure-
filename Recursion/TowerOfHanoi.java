import java.util.*;
class TowerOfHanoi
{
	static void Toh(int n,String str1,String str2,String str3)
	{
		if(n==0)
		{
			return;
		}
		Toh(n-1,str1,str3,str2);
		System.out.println(n+"["+str1+"->"+str3+"]");
		Toh(n-1,str2,str1,str3);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String str1="A";
		String str2="B";
		String str3="C";
		TowerOfHanoi.Toh(n,str1,str2,str3);
	}
}