import java.util.*;
class SinglyReverse
{
	class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	Node head=null;
	Node tail=null;

	public void addNode(int data)
	{
		Node newNode= new Node(data);

		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void reverse(Node p)
	{
		if(p==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			if(p.next==null)
			{
				System.out.println(p.data);
				return;
			}

			reverse(p.next);
			System.out.println(p.data);
		}
	}

	public void display()
	{
		Node p=head;

		if(p==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(p!=null)
			{
				System.out.println(p.data);
				p=p.next;
			}
		}
	}
	public static void main(String args[])
	{
		SinglyReverse s=new SinglyReverse();
		for(int i=1;i<=10;i++)
		{
			int x=i;
			s.addNode(x);
		}
		System.out.println("original list is:-");
		s.display();
		System.out.println("reverse List is:-");
		s.reverse(s.head);
	}
}