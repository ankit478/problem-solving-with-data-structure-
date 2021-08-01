import java.io.*;
import java.util.*;

public class TilingFloor{
    static int totalWays(int n)
    {
        int n1=1;
        int n2=2;
        int c=0;
        if(n==1)
        {
        return n1;
        }
        if(n==2)
        {
        return n2;
        }
        for(int i=3;i<=n;i++)
        {
            c=n1+n2;
            n1=n2;
            n2=c;
        }
        return c;
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(totalWays(n));
    }
}