import java.io.*;
import java.util.*;

public class MaxSumofNonAdjacent{
    static int maximumSum(int arr[])
    {
        int inc=arr[0];
        int exc=0;
        for(int i=1;i<arr.length;i++)
        {
            int ninc=exc+arr[i];
            int nexc=Math.max(exc,inc);
            
            inc=ninc;
            exc=nexc;
        }
        return Math.max(exc,inc);
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
            
        }
        System.out.println(maximumSum(arr));

    }
}