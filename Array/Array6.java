import java.util.*;
class Array6
{
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("C");
		str.add("C++");
		str.add("Java");
		str.add("Python");
		str.add("R");
		str.add("Spark");
		System.out.println("initial List:-"+str);
		str.remove(5);
		System.out.println("updated list:-"+str);
		boolean status=str.remove("Spark");
		System.out.println("is Spark is removed="+status);
		ArrayList<String> str2 = new ArrayList<String>();
		str2.add("Sql");
		str2.add("Python");
		str2.add("Javascript");
		str.removeAll(str2);
		System.out.println("updates list:-"+str);
		str.removeIf(new predicate<String>)(){@Override

			public boolean test(String s){

				return s.startsWith("C");
			}
		};
		System.out.println("updated list:-"+str);
	}
}