import java.util.*;
class StringandStringBf
{
	public static void main(String args[])
	{
		TreeSet t= new TreeSet(new MyComparator());
		t.add("A");
		t.add("xx");
		t.add("ABC");
		t.add(new StringBuffer("tt"));
		t.add("Abcd");
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
  	String S1= obj1.toString();
  	String S2=obj2.toString();
  	int l1=S1.length();
  	int l2=S2.length();
  	if(l1>l2)
  		return +1;
  	if(l2<l1)
  		return -1;
  	else
  		return S1.compareTo(S2);
  }
}