import java.util.*;
class Employee implements Comparable
{
	String name;
	int eid;
	public Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	public String toString()
	{
		return name+"-"+eid;
	}
	public int compareTo(Object obj)
	{
		int eid1=this.eid;
		Employee e=(Employee)obj;
		int eid2=e.eid;
		if(eid1>eid2)
		{
			return +1;
		}
		else if(eid1<eid2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
class CompComp
{
	public static void main(String args[])
	{
		Employee e1=new Employee("ani",202);
		Employee e2= new Employee("radha",102);
		Employee e3=new Employee("sushi",302);
		Employee e4=new Employee("anil",403);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);

		TreeSet t1=new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;

		String S1=e1.name;
		String S2=e2.name;
		return S1.compareTo(S2);
	}

}
