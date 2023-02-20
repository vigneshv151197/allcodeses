package Programmes1;

import java.util.Scanner;

public class FibonacciCalculator {

	
	public static void main(String[] args) {
		
		
		System.out.println("Enter number upto which Fibonacci series to print: ");

		  int number = new Scanner(System.in).nextInt();
		  
		  
		  System.out.println("Fibonacci series upto " + number +" numbers : ");

		    //printing Fibonacci series upto number 
		  
		  
		  for(int i=1; i<=number; i++){ 
			  
			  System.out.print(fibonacci2(i) +" "); 
			  
		  }

		
	}

	private static int fibonacci2(int number) {
		
		if(number == 1 || number == 2){ 
			return 1; 
			}
		
		return  fibonacci2(number-1) + fibonacci2(number -2);
	}

	
	
	
}
