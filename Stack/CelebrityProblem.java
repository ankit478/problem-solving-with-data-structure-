import java.util.*;
class CelebrityProblem
{
	static void celebrity(int arr[][])
	{
		Stack <Integer> s=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			
			s.push(i);
		}
		while(s.size()>=2)
		{
			int i1=s.pop();
			int i2=s.pop();
			if(arr[i1][i2]==1)
			{
				s.push(i2);
			}
			else
			{
				s.push(i1);
			}
		}
		int pot=s.pop();
		for(int i=0;i<arr.length;i++)
		{
			if(i!=pot)
			{
				if(arr[i][pot]==0 || arr[pot][i]==1)
				{
					System.out.println("none");
					System.exit(0);
				}

			}
		}
		System.out.println(pot);

	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		celebrity(arr);
	}
}