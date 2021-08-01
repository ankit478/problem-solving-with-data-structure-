import java.util.*;
class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap m=new TreeMap();//default natural sorting order
		m.put(105,"ani");
		m.put(103,"dugu");
		m.put(106,"betu");
		m.put(102,"sneha");
		System.out.println(m);
	}
}