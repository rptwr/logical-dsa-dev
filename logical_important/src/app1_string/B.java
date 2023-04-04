package app1_string;

import java.util.Arrays;

public class B {
	public static void main(String[] args) {
		int num = 4;
		int sum , count = 0;
        for(int i = 2 ; i < num ; i++)
        {
            sum = i + i;
            System.out.println(sum);
            if(sum % 2 == 0)
            {
            	//System.out.println(sum);
                count ++;
            }
        }
	    System.out.println(count);
	}
}

