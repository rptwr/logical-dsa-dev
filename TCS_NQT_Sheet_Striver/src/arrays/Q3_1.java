package arrays;

import java.util.Scanner;

// Java Program to find the second largest and second smallest elements in the array without using Functions

public class Q3_1 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;   //  //Declare array size
		System.out.println("Enter the size of an array ");
		n = sc.nextInt();	//	Initialize array size
		
		int[] arr = new int[n];  // Declare array
		System.out.println("Enter the array ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();   // Initialize array
		}

//		int[] arr = { 2, 1, 4, 6, 7, 5 };
//		int n = arr.length;
		for (int i = 0; i < n; i++) // //Use to hold the element
		{
			for (int j = i + 1; j < n; j++)  // //Use to compare with the rest of the elements 
			{
				if (arr[i] > arr[j]) // //Check and swap
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		System.out.println("Second Smallest Element in the array: " + arr[1]);
		System.out.println("Second Largest Element in the array: " + arr[n - 2]);
	}
}

