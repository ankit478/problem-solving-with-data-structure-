import java.util.*;
class Array4
{
	public static void main(String args[])
	{
		ArrayList<Integer> odd= new ArrayList<Integer>();
         for(int i=0;i<10;i++)
         {
         	if(i%2!=0)
         	{
         		odd.add(i);
         	}
         }
         System.out.println(odd);

         ArrayList<Integer> numbers=new ArrayList<Integer>(odd);
         System.out.println(numbers);
         
         ArrayList<Integer> even1=new ArrayList<Integer>();
         for(int i=0;i<10;i++)
         {
         	if(i%2==0)
         	{
         		even1.add(i);
         	}
         }
         System.out.println(even1);

         numbers.addAll(even1);
         System.out.println(numbers);
         //Collections.sort(numbers);
         //System.out.println(numbers);
         ArrayList<Integer> any=new ArrayList<Integer>();
         any.add(8);
         any.add(11);
         any.add(13);
         numbers.addAll(3,any);
         numbers.add(0,0);
         System.out.println(numbers);
         Collections.sort(numbers);
         System.out.println(numbers);
	}
}