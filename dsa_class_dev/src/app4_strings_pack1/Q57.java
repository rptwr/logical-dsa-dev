package app4_strings_pack1;

import java.util.Scanner;

public class Q57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email id");
		String email = sc.next();
		int i = email.indexOf('@');
		if(i == -1)
		{
			System.out.println(email + "invalid. there is no @");
			return;
		}
		int j = email.indexOf('.', i);
		if(j == -1)
		{
			System.out.println(email + "invalid. there is no dot after @");
			return;
		}
		if((i + 1) == j)
		{
			System.out.println(email + "invalid. dot should not be immediately after @");
			return;
		}
		if(j == email.length() - 1)
		{
			System.out.println(email + "invalid. dot should not be at the end");
			return;
		}
		System.out.println(email + " is valid");
	}
}


// we can not modify once string object created
//String s1 = "abc";
//sop(s1);
//s1 = s1 + "xyz";
//sop(s1);

//total heap memory can be devide into two pool constant pool and normal pool
//every string constraint storing into constraint pool
//int the string constraint poll it wont allow duplicate
