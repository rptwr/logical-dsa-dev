package app1_string;

import java.util.Arrays;

public class C {
	public static void main(String[] args) {
		String s  =  "capiTalIze tHe titLe";
		String s1 = capitalizeTitle(s);
		System.out.println(s1);
	}
	public static String capitalizeTitle(String title) {
        String [] s1 = title.split(" ");
        String s = "";
        a:
        for(int i = 0 ; i < s1.length ; i ++)
        {
            char[] c1 = s1[i].toCharArray();
            if(c1.length <2)
            {
              if(c1[0] >='A' && c1[0] <='Z')
            	  c1[0] = (char)(c1[0] +32);
              if(c1[1] >='A' && c1[1] <='Z')
            	  c1[1] = (char)(c1[1] +32);
              s += new String(c1) + " ";
              continue a;
            }
            if(c1[0] >='a' && c1[0] <='z')
            	c1[0] = (char)(c1[0] -32);
            for(int j = 1 ; j < c1.length;j++)
            {
            	 if(c1[j] >='A' && c1[j] <='Z')
            	 {
            		 c1[j] = (char)(c1[j] +32);
            	 }
            }
            s += new String(c1) + " ";
 
        }   
        return s;
    }
}
