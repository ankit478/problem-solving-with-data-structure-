import java.util.*;
class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet h= new HashSet();
		h.add("ani");
		h.add("betu");
		h.add("dugu");
		h.add("gadhi");
		h.add(10);
		h.add(null);
		System.out.println(h.add("ani"));
		System.out.println(h);
	}
}