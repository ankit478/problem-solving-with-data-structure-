import java.io.*;
import java.util.*;

public class CountStairs{
    static int countPath(int n,int qb[])
    {
         if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(qb[n]!=0)
        {
            return qb[n];
        }
        int path1=countPath(n-1,qb);
        int path2=countPath(n-2,qb);
        int path3=countPath(n-3,qb);
        int path=path1+path2+path3;
        
        qb[n]=path;
        return path;
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       System.out.println(countPath(n,new int[n+1]));
    }

}