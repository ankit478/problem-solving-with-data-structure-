import java.io.*;
import java.util.*;

public class LongestConsequtive{
    static void lcs(int arr[])
    {
        HashMap<Integer,Boolean> m=new HashMap<>();
        for(int val:arr)
        {
            m.put(val,true);
        }
        for(int val:arr)
        {
            if(m.containsKey(val-1))
            {
                m.put(val,false);
            }
        }
        int msp=0;
        int ml=0;
        for(int val:arr)
        {
            if(m.get(val)==true)
            {
                int tl=1;
                int tsp=val;
                while(m.containsKey(tsp+tl))
                {
                    tl++;
                }
                if(tl>ml)
                {
                    msp=tsp;
                    ml=tl;
                }
            }
        }
        for(int i=msp;i<msp+ml;i++)
        {
            System.out.println(i);
        }
    }

public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=in.nextInt();
    }
    lcs(arr);
 }

}