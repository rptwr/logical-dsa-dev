package app1_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class M5 {
	public static void main(String[] args) {
		String s = "(((	";
		int right = 0;
        int left = 0;
        int i = 0;
        Stack<Character> s1 = new Stack();
        for(i = 0; i < s.length()-1;i++)
        {
            if(s.charAt(i) == '(')
            {
               s1.add(s.charAt(i));
               if(s.charAt(i+1) == ')')
               s1.pop();
            }
            else
            s1.add(s.charAt(i));
        }
        if(s.charAt(s.length()-1) == '(') {
        	s1.add(s.charAt(s.length()-1));
        }
        else
        	s1.pop();
        
        System.out.println(s1);
        System.out.println(s1.size());
  
    }
}
