import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
   
    	
        Scanner scanner = new Scanner(System.in);
   
        int T = scanner.nextInt();
      
        TreeSet<Long> tree;
        for(int t=0;t<T;t++)
        {	
        	tree = new TreeSet<Long>();
        	
	        int N = scanner.nextInt();
	        long M = scanner.nextLong();
	        long[] arr = new long[N+1];
	        long[] prefix = new long[N+1];
	 
	        arr[0] = 0; prefix[0] = 0;
	        
	        for(int i=1;i<=N;i++)
	        {
	        	arr[i] = scanner.nextInt() % M;
	
	        	prefix[i] = ((prefix[i-1] + arr[i]) % M);
	        }
	        
	        long result = 0;
	        long max_i = 0;
	        long prev = 0;
	        
	        for(int i=1;i<=N;i++)
	        {
	        	max_i = prefix[i];
	        	if(tree.higher(prefix[i])!=null)
	        	{
	        		prev = tree.higher(prefix[i]);
	        		max_i = ((prefix[i] - prev + M) % M);
	        	}	
	        	result = Math.max(result, max_i);
	        	tree.add(prefix[i]);
	        }
	        
	        System.out.println(result);
        }
     
    }
}
