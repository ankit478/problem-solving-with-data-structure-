import java.util.*;
class Array5
{
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		System.out.println("is the company list empty?"+str.isEmpty());
		str.add("Google");
		str.add("Amazon");
		str.add("Facebook");
		str.add("Apple");
		str.add("Microsoft");
		System.out.println(str);
		System.out.println("here top "+str.size()+"Companies in the world is:-");
		System.out.println(str);
		String bestcompany= str.get(0);
		System.out.println("Best company:-"+bestcompany);
		str.set(4,"Walmart");
		System.out.println("new list:-"+str);
	}
}