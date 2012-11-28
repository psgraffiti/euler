// problem 2
// http://projecteuler.net/problem=2

// By considering the terms in the Fibonacci sequence whose values do not exceed
// four million, find the sum of the even-valued terms.

import java.util.*;

public class no2 
{
	public static void main(String[] args)
	{
		System.out.println("1,2,3,...");
		
		int sum = 2;
		int n1 = 1;
		int n2 = 2;
		int nf = fib(n2, n1);
		
		while(nf < 4000000)
		{
			if(nf % 2 == 0)
				sum += nf;
				
			n1 = n2;
			n2 = nf;
			nf = fib(n2, n1);
			
			System.out.print(nf + ", ");
		}
		
		System.out.println();
		System.out.println("SUM: " + sum);
	}
	
	private static int fib(int n2, int n1)
	{
		return n2 + n1;
	}
}
		 