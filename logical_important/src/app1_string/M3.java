package app1_string;

import java.util.Arrays;

public class M3 {
	public static void main(String[] args) {
		String s1 = "abc xyz pqr jbfue bbou kln opw";
		String [] s2 =  s1.split(" ");
		String s3 ;
		for(int i = 0 ; i < s2.length; i++)
		{
			s3 = s2[i];
			if(s3.length() == 3 )
			{
				System.out.println(s2[i]);
			}
		}
	}
}
