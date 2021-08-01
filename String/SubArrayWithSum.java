import java.util.*;
import java.lang.*;
class SubArrayWithSum
{
	static void findSubarraySum(int arr[], int n, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
    
        for (int j = 0; j < n; j++) 
        { 
            prefixSum = prefixSum + arr[j]; 
    
            if (prefixSum == sum) 
            { 
                System.out.print(0 + " " + j);
                return; 
            } 
    
            if (map.containsKey(prefixSum - sum)) 
            {
                System.out.print((map.get(prefixSum - sum) + 1) + " " + j);
                return; 
            }

            
            map.put(prefixSum, j); 
        }
        
        System.out.print(-1);
    }

  public static void main(String[] args)
  {
    int arr[] = {3, 17, -3, 9, 7, -5};
    int n = arr.length;
    int sum = 23;
    SubArrayWithSum.findSubarraySum(arr, n, sum);
  }
}
