import java.io.*;
import java.util.*;

public class Intersection{
    static void common(int a[],int b[])
    {
       HashMap<Integer,Integer> m=new HashMap<>();
       for(int val:a)
       {
           if(m.containsKey(val))
           {
               int of=m.get(val);
               int nf=of+1;
               m.put(val,nf);
           }
           else
           {
               m.put(val,1);
           }
       }
       for(int val:b)
       {
           if(m.containsKey(val))
           {
               System.out.println(val);
               int of=m.get(val);
               int nf=of-1;
               m.put(val,nf);
               
           }
       }
    }

public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int a[]=new int[n1];
    for(int i=0;i<a.length;i++)
    {
        a[i]=in.nextInt();
    }
    int n2=in.nextInt();
    int b[]=new int[n2];
    for(int i=0;i<b.length;i++)
    {
        b[i]=in.nextInt();
    }
    common(a,b);
    
    
 }

}