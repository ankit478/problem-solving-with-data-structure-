import java.util.*;

class Singly2
{
	int count=0;
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
		Node newNode = new Node(data);

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
			return;
		}
		else
		{
			System.out.println("Nodes of Singly Linked list:-");

			while(p!=null)
			{
				count++;
				System.out.println(p.data);
				p=p.next;
			}
		}
		System.out.println("total nodes are:-"+count);
	}

	public static void main(String args[])
	{
		Singly2 s=new Singly2();
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
                   int x=i;
                  s.addNode(x);
        

	}
	s.display();
}
}