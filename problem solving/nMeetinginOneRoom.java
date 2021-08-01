import java.util.*;
import java.io.*;
class Meeting
{
	int start,finish;
	Meeting(int start,int finish)
	{
		this.start=start;
		this.finish=finish;
	}
};
class myComparator implements Comparator<Meeting>
{
	public int compare(Meeting s1,Meeting s2)
	{
		return s1.finish - s2.finish;
	}
}
class nMeetinginOneRoom
{
	static void meetingPossible(int start[],int finish[],int n)
	{
		
		Meeting arr[]=new Meeting[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Meeting(start[i],finish[i]);
		}
		Arrays.sort(arr,new myComparator());
		int i=0;
		System.out.print(arr[i].start);
		for(int j=1;j<n;j++)
		{
			if(arr[j].start>=arr[i].finish)
			{
				System.out.print(" "+arr[j].start);
				i=j;
			}
		}
	}
	public static void main(String args[]) throws IOException
	{
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int start[]=new int[n];
       int finish[]=new int[n];
       for(int i=0;i<n;i++)
       {
       	start[i]=in.nextInt();
       	finish[i]=in.nextInt();
       }
      /* for(int i=0;i<n;i++)
       {
       	finish[i]=in.nextInt();
       }*/
       nMeetinginOneRoom meet=new nMeetinginOneRoom();
       meet.meetingPossible(start,finish,n);
	}
}