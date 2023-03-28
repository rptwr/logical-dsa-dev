package app3_arrays_pack1;

/*
Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.

*/

import java.util.*;
class Q144
   {
	public static void main ( String ar [])
	{
	Scanner sc=new Scanner (System.in);
	int n,p=0,c=0,o=0,e=0,z=0;
	 for(int i=1;i<=20;i++);
	 {
	  System.out.println("Enter a number");
			n=sc.nextInt();
			if (n>0)
			p++; 
			if (n<0)
			c++; 
			if (n%2==0)
			e++;
			if (n%2!=0)
			o++; 
			if (n==0)
			z++; 
		}
		System.out.println("number of positive numbers  "+p);
		System.out.println("number of negative numbers  "+c);
		System.out.println("number of odd numbers  "+o);
		System.out.println("number of even numbers  "+e);
		System.out.println("number of zeroes "+z);
   }
}