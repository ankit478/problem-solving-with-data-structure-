 import java.util.*;
 class Palindrom
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
 	public int size;
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
 		size++;
 	}
 	public Node reverseList(Node temp)
 	{
 		Node p=temp;
 		Node prevNode=null;
 		Node nextNode=null;

 		while(p!=null)
 		{
 			nextNode=p.next;
 			p.next=prevNode;
 			prevNode=p;
 			p=nextNode;
 		}
 		return prevNode;
 	}

 	public void isPalindrom()
 	{
 		Node p=head;
 		boolean flag=true;

 		int mid=(size%2==0)?(size/2):((size+1)/2);

 		for(int i=1;i<mid;i++)
 		{
 			p=p.next;
 		}

 		Node revHead=reverseList(p.next);

 		while(head!=null && revHead!=null)
 		{
 			if(head.data!=revHead.data)
 			{
 				flag=false;
 				break;
 			}
 			head=head.next;
 			revHead=revHead.next;
 		}
 		if(flag)
 		{
 			System.out.println("Given Linked list is palindrome");
 		}
 		else
 		{

          System.out.println("Given Linked list is not palindrome");
 		}
 	}
 	public void display()
 	{
 		Node p=head;
 		if(p==null)
 		{
 			System.out.println("List is empty");
 			return;
 		}
 		else
 		{
 			System.out.println("your Linked list is");

 			while(p!=null)
 			{
 				System.out.println(p.data);
 				p=p.next;
 			}
 		}
 	}
 	public static void main(String args[])
 	{
       Palindrom d=new Palindrom();
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the values for linked list");
       for(int i=1;i<=5;i++)
       {
       	int x=in.nextInt();
       	d.addNode(x);
       }
       d.display();
       d.isPalindrom();
 	}
 }