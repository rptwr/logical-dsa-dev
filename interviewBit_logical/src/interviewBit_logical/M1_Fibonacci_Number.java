package interviewBit_logical;

import java.util.Scanner;

// a. Java Program to generate Nth Fibonacci Number using Iteration.
//  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

public class M1_Fibonacci_Number {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int fibN = fibonacci(n);
		if (n < 0) {
			System.out.println("N can not be negative");
			return;
		}
		System.out.println("The " + n + "th Fibonacci number is " + fibN);
	}
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

}

/*
 * Write a program in Java to generate the Nth Fibonacci Number using Iteration
 * and Constant Space. ---------------------- Fibonacci Series is a series in
 * which the Nth term is the sum of the previous 2 terms i.e. (N-1)th and
 * (N-2)th terms. The first 2 terms of the Fibonacci sequence are always known.
 * They are 0 and 1 respectively. ------------ So, in general, we can derive a
 * generic term i.e. Fib(N) = Fib(N - 1) + Fib(N - 2) So, let us now write a
 * program to find the Nth Fibonacci Number using iteration.
 * 
 * 
 * -------------------------
 * Corner Cases You might Miss: The simple mistake of not handling the corner
case when N is negative can happen to a lot of programmers. Since the number
of terms can’t be negative, this should be handled separately as shown in the
code above.
Time Complexity: O(N) because we have to travel N terms
Auxiliary Space:  O(1) as no extra space is used.
Follow up: You can also solve this problem using dynamic programming. This
will take up O(N) space as well and the time complexity will be the same i.e.
O(N). Try the dynamic programming approach yourself.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */