import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
   
    	int N = scanner.nextInt();
    	int[] arr = new int[N];
    	
    	for(int i=0;i<N;i++)
    		arr[i] = scanner.nextInt();
    	
    	int[] index = new int[N];
    	index[0] = arr[0];
    	int pivot =1;
    	int l=-1,r,m;
    	
    	for(int i=1;i<N;i++)
    	{
    		if(arr[i] < index[0])
    			index[0] = arr[i];
    		
    		else if(arr[i] > index[pivot-1])
    		{
    			index[pivot++] = arr[i];
    			
    		}
    		
    		else
    		{
    			r = pivot-1;
    			l = -1;
    			while(r - l > 1)
    			{
    				m = l + (r-l)/2;
    				if(index[m] >= arr[i])
    					r = m;
    				else
    					l = m;
    			}
    			index[r] = arr[i];
    		}	
    	}
    	
    	System.out.println(pivot);
    	 scanner.close();
    }

}
