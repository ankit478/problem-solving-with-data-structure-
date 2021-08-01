import java.util.*;
class StringSort
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add("Betu");
		t.add("Ani");
		t.add("dugu");
		t.add("gadhi");
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String S1=(String)obj1;
		String S2=obj2.toString();
		return S2.compareTo(S1);
		
	}
}