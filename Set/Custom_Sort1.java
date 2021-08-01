import java.util.*;
class Custom_Sort1
{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(2);
		t.add(15);
		t.add(3);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		//return I1.compareTo(I2);
		//return -I1.compareTo(I2);
		
		//return I2.compareTo(I1);
		
		//return -I2.compareTo(I1);
		//return +1; 
		//return -1;
		//return 0;
		
	}
}