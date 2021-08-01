import java.util.*;
class StringBufferSort
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("Betu"));
		t.add(new StringBuffer("Ani"));
		t.add(new StringBuffer("dugu"));
		t.add(new StringBuffer("gadhi"));
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String S1=obj1.toString();
		String S2=obj2.toString();
		return S2.compareTo(S1);

		
	}
}