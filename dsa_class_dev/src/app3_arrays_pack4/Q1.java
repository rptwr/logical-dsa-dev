package app3_arrays_pack4;

import java.util.Scanner;
// Write a program to check whether an integer is Armstrong number or not.

public class Q1 {
	boolean Aramstrong(int i)
	{
		int arm=0,temp=i;
		String s =""+i;
		int pow = s.length();
		while(temp>0)
		{
			arm += Math.pow((temp%10), pow);
			temp /= 10; 
		}
		if(i== arm)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		boolean flag = new Q1().Aramstrong(i);
		System.out.println(i +((flag == true)?" is a aremtrong number":" is not a aremtrong number"));
	}
}
