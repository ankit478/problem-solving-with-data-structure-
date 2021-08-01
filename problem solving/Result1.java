import java.util.*;
class Result {
    public static int findOddMan(List<Integer> arr) {
          int result=0;    
    	for(int i=0;i<arr.length;i++)
    	{
          result=result^arr[i];
    	}
    	return result;
    

    }
    public static void main(String args[])
    {
    	int a[]={3,2,1,2,1,1,3};
    	List <Integer> arr=Arrays.asList(a);
    	System.out.println(findOddMan(arr));
    }
}

