import java.util.*;
class SinglyBeg
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

	Node head;
	Node tail;

	public void addFirst(int data)
	{
		Node newNode = new Node(data);

		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void addNode(int data)
	{
		Node newNode=new Node(data);

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
	public void display()
	{
		Node p=head;

		if(p==null)
		{
			System.out.println("List is Empty");
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
		SinglyBeg s=new SinglyBeg();
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			s.addNode(i);
		}
		System.out.println("your linked list is:-");
		s.display();
		int val;
		System.out.println("Enter your value that you want to insert first");
		val=in.nextInt();
		System.out.println("after insertion your linked list is:-");
		s.addFirst(val);
		s.display();
	}
}