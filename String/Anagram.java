 import java.util.*;
 import java.lang.*;
 class Anagram
 {
  static void anagramString(String a, String b)
  {
    if(a.length()!=b.length())
    {
      System.out.println("String are not Anagram");
      return;
    }
    int count[]= new int[256];
    for(int i=0;i<a.length();i++)
    {
      count[a.charAt(i)]++;
      count[b.charAt(i)]--;
    }
    for(int i=0;i<256;i++)
    {
      if(count[i]!=0)
      {
        System.out.println("String are not anagram");
        return;
      }
    }
    System.out.println("String are anagram");
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String a=in.nextLine();
    String b=in.nextLine();
    Anagram o = new Anagram();
    o.anagramString(a,b);
  }
 }