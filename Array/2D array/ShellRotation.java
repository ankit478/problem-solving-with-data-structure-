import java.util.*;
import java.io.*;
class ShellRotation
{
	static void rotateShell(int arr[][],int s,int r)
	{
		int oned[]=fillOnedFromShell(arr,s);
		rotate(oned,r);
		fillShellFromOned(arr,s,oned);
	}
	static int [] fillOnedFromShell(int arr[][],int s)
	{
		int minr=s-1;
		int minc=s-1;
		int maxr=arr.length-s;
		int maxc=arr[0].length-s;
		int sz=2*(maxr-minr+maxc-minc);
		int oned[]=new int[sz];
		//lw
		int idx=0;
		for(int i=minr,j=minc;i<=maxr;i++)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		minc++;
		//bw
		for(int i=maxr,j=minc;j<=maxc;j++)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		maxr--;
		//rw
		for(int i=maxr,j=maxc;i>=minr;i--)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		maxc--;
		//tw
		for(int i=minr,j=maxc;j>=minc;j--)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		return oned;

	}
	static void fillShellFromOned(int arr[][],int s,int oned[])
	{
		int minr=s-1;
		int minc=s-1;
		int maxr=arr.length-s;
		int maxc=arr[0].length-s;
		//lw
		int idx=0;
		for(int i=minr,j=minc;i<=maxr;i++)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		minc++;
		//bw
		for(int i=maxr,j=minc;j<=maxc;j++)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		maxr--;
		//rw
		for(int i=maxr,j=maxc;i>=minr;i--)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		maxc--;
		//tw
		for(int i=minr,j=maxc;j>=minc;j--)
		{
			arr[i][j]=oned[idx];
			idx++;
		}

	}
	static void rotate(int oned[],int r)
	{
		if(r<0)
		{
			r=r+oned.length;
		}
		r=r%oned.length;
		reverse(oned,0,oned.length-r-1);
		reverse(oned,oned.length-r,oned.length-1);
		reverse(oned,0,oned.length-1);
	}
	static void reverse(int oned[],int li,int ri)
	{
		while(li<ri)
		{
			int temp=oned[li];
			oned[li]=oned[ri];
			oned[ri]=temp;
			li++;
			ri--;
		}
	}
	static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int arr[][]=new int[n][m];

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		
		}
		System.out.println("Before rotation");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		int s=in.nextInt();
		int r=in.nextInt();

		rotateShell(arr,s,r);
		display(arr);
	}
}