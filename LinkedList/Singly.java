import java.util.*;
class Singly
{
	Node head;

	static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	public void display()
	{
		Node n=head;

		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String args[])
	{
		Singly s=new Singly();

		s.head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(300);
		s.head.next=second;
		second.next=third;
		s.display();
	}
}