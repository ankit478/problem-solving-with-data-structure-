import java.util.*;
class TreeMapDemo1
{
	public static void main(String args[])
	{
		TreeMap m=new TreeMap(new MyComparator());//customized  sorting order
		m.put("xxx",10);
		m.put("aaa",12);
		m.put("zzz",8);
		m.put("sss",15);
		System.out.println(m);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}