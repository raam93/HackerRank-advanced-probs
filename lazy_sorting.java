import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {

   

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);

	 int n = scanner.nextInt();
	 
	 int[] arr = new int[101];
	 
	 int curr, prev = 0;
	int sortedCount = 0;
	 
	 for(int i=0;i<n;i++)
	 {
		 curr = scanner.nextInt();
		 arr[curr] += 1; 
		 
		 if(curr >= prev)
		 {
			 sortedCount++;
			 prev = curr;
		 }
	 }
		
	 if(sortedCount == n)
	 {
		 System.out.println("0.000000");
		 return;
	 }
		 
	BigInteger num = fact(n);

	BigInteger den = BigInteger.valueOf(1);
	
	for(int i=1;i<=100;i++)
	{
		if(arr[i] > 1)
		{
			den = den.multiply(fact(arr[i]));
		}
	}
			
	BigDecimal num1 = new BigDecimal(num);
	BigDecimal den1 = new BigDecimal(den);
		
	
	BigDecimal res = num1.divide(den1);
	
	System.out.println(String.format("%.6f", res));
	
	 scanner.close();
		 
	}
	

	public static BigInteger fact(int n){
		
		BigInteger factorial = BigInteger.ONE;
		
		for(int i=1;i<=n;i++)
			factorial = factorial.multiply(BigInteger.valueOf(i));
	
		return factorial;
	}

}
