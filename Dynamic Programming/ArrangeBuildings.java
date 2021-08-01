import java.io.*;
import java.util.*;

public class ArrangeBuildings{
    static long arrangeBuildings(long n)
    {
        long obds=1;
        long ospc=1;
        for(int i=2;i<=n;i++)
        {
            long nbds=ospc;
            long nspc=obds+ospc;
            
            ospc=nspc;
            obds=nbds;
        }
        long res=obds+ospc;
        return (res*res);
    }
    

public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);
    long n=in.nextInt();
    System.out.println(arrangeBuildings(n));
    
 }

}