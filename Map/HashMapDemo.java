import java.util.*;
class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap m= new HashMap();
		m.put("ani",700);
		m.put("ravi",100);
		m.put("dugu",200);
		m.put("gawar",300);
		System.out.println(m);
		System.out.println(m.put("ani",1000));
		Set s= m.keySet();
		System.out.println(s);
		Collection c= m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);

		//here we used iterator to get the entries in one by one

		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"__"+m1.getValue());

			if(m1.getKey().equals("dugu"))
			{
				m1.setValue(1200);
			}
		}
	System.out.println(m);
}
}