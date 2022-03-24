package javatextbookproblems;

import java.util.Scanner;
public class PrimeNums {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer");
		int integer = in.nextInt();
		int prime = 0;
		boolean isPrime = true;
		System.out.println("Prime numbers up to " + integer + ": ");
		for (int i = 1; i < integer; i++) {
			isPrime=true;
			for (int j = 2; j < i; j++) {
				//System.out.println("i="+i+" j="+j);
				if (i == 1 || i % j == 0) {
					
					isPrime = false;
		
				}
				
					
			}
			//System.out.println("i="+i+" isPrime="+isPrime);
			if (isPrime && i!=1) {
				System.out.println(i);
			}
		}
	}
}