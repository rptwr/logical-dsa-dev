package app4_strings_pack1;

import java.util.Scanner;

/*
reverse the string by retaining white spaces
s1 = "abc hello l te java";
output:
      ava jet1o l le hcba
*/
public class Q36
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line of cahr");
		//String line=sc.nextLine();
		String s1="abc hello 1 te java";
		String s2="";
		
		for(int i=0,j=s1.length()-1;j>=0;j--,i++)
		{
			if(s1.charAt(i)==' ')
			{	s2+=' ';
				j++;
				continue;
			}
			if(s1.charAt(j)!=' ')
			{   
				s2 +=s1.charAt(j);
			}else
			{
				i--;
			}
		}
		//s1=new String(s2);
		//System.out.println(java.util.Arrays.toString(chars));
		System.out.println(s2);
	}

}