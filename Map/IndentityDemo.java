import java.util.*;
class IndentityDemo
{
	public static void main(String args[])
	{
		IdentityHashMap m=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1,"ani");
		m.put(i2,"dugu");
		System.out.println(m);
	}
}