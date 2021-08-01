import java.util.*;
class SinglyMid
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

	public void addMiddle(int data,int key)
	{
		Node newNode = new Node(data);

		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node p=head;
			while(p!=null)
			{
				if(p.data==key)
				{
					break;
				}
				p=p.next;
			}
			newNode.next=p.next;
			p.next=newNode;
			
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
	public void delete()
	{
		
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
			if(head!=tail)
			{
				head=head.next;
			}
		else
		{
			head=tail=null;
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
		SinglyMid s=new SinglyMid();
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			s.addNode(i);
		}
		System.out.println("your linked list is:-");
		s.display();
		int val;
		System.out.println("Enter your value and key after that you want to insert element");
		val=in.nextInt();
		int loc=in.nextInt();
		System.out.println("after insertion your linked list is:-");
		s.addMiddle(val,loc);
		s.display();
		s.delete();
		s.display();
	}
}