import java.io.*;
import java.util.*;

public class Fibonacci{
    static int fib(int n,int qb[])
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(qb[n]!=0)
        {
            return qb[n];
        }
        int fib1=fib(n-1,qb);
        int fib2=fib(n-2,qb);
        int fn=fib1+fib2;
        qb[n]=fn;
        return fn;
        
    }

public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(fib(n,new int[n+1]));
 }

}