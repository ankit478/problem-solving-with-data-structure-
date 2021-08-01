 import java.util.*;
 class MultipleSum {
    static long multipleSum(int x) {
      long result=0;
      float sum3=0,sum5=0,sum15=0;
      float n=x/3;
      sum3=n/2*(2*3+(n-1)*3);
      n=x/5;
      sum5=n/2*(2*5+(n-1)*5);
      n=x/15;
      sum15=n/2*(2*15+(n-1)*15);
      result=sum3+sum5-sum15;
      return result;
    }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    System.out.println(multipleSum(x));
  }
}