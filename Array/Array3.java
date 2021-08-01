import java.util.*;
class Array3
{
	public static void main(String args[])
	{
	int pos,element,size;
	int num[]=new int[100];
	Scanner in=new Scanner(System.in);
	System.out.println("enter the size of your array");
	size=in.nextInt();
	System.out.println("enter values");
	for(int i=0;i<size;i++)
	{
		num[i]=in.nextInt();
	}
	System.out.println("your array is");
	for(int i=0;i<size;i++)
	{
       System.out.println("value of index"+i+"="+num[i]);
	}
	System.out.println("enter position where you want to delete element");
	pos=in.nextInt();
	System.out.println("enter new element");
	element=in.nextInt();
	for(int i=size-1;i>=pos;i--)
	{
		num[i+1]=num[i];
	}
	num[pos]=element;
	System.out.println("the new array is");
	for(int i=0;i<=size;i++)
	{
		System.out.println("value of index"+i+"="+num[i]);
	}

}
}