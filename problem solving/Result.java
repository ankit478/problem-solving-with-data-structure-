import java.util.*;
class Result {
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    Result r=new Result();
    r.bulbSwitch(n);
  
  }
    static int bulbSwitch(int n){
         int result=0;
        for(int i=1;i*i<=n;i++)
        {
          
          System.out.println(i*i);

          
        }
        return 0;

      

    }
}