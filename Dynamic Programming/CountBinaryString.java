import java.io.*;
import java.util.*;

public class CountBinaryString{
    static int countBinary(int n)
    {
        int ozeros=1;
        int oones=1;
        for(int i=2;i<=n;i++)
        {
            int nzeros=oones;
            int nones=ozeros+oones;
            
            oones=nones;
            ozeros=nzeros;
        }
        int res=oones+ozeros;
        return res;
    }

public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(countBinary(n));
 }

}