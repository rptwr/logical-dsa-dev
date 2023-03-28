package app4_strings_pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q45 
	{
		public static void main(String[] args) {
			String src = "a1b2c3d4hello6";
			System.out.println(src);
			String expression = "[1-8]";
			Pattern pattern = Pattern.compile(expression);
			Matcher matches = pattern.matcher(src);
			
			while(matches.find())
			{
				System.out.println(matches.group() + ":" + matches.start());
				
			}
		}
	}

