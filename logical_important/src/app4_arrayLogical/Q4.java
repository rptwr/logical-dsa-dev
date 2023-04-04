package app4_arrayLogical;

import java.util.Arrays;

public class Q4 {
	public static void main(String[] args) {
		int[] a1 = {1 , 2 , 4 , 10 , 10 , 15 , 16 , 1 , 2 , 2 , 8 , 4,  4 , 4 , 8 , 5 , 6 , 6 , 2 , 1 , 10 , 10};
		System.out.println("initial:"+Arrays.toString(a1));
		int count = 0;
		boolean isSecond;
		for (int i = 0; i < a1.length; i++) 
		{
		    isSecond = true;
			for (int j = i+1; j < a1.length-count; j++) 
			{
				if(a1[i] == a1[j])
				{
					if(isSecond)
					{
						isSecond = false;
						continue;
					}
					for (int k = j; k < a1.length-1-count; k++) 
					{
						a1[k] = a1[k+1];
					}
					j--;
					count++;
				}
			}
		}
	}

}
