package app4_arrayLogical;

import java.util.Arrays;
public class Q3 {
	public static void main(String[] args) {
		int[] a1 = {1, 90, 20, 60, 40, 190, 400, 50, 100, 30};
		System.out.println("initial;"+Arrays.toString(a1));
		int bigrElmnt ;
		for (int i = 0; i < a1.length; i++) 
		{
			bigrElmnt=a1[i];
			for (int j = i+1; j < a1.length; j++) 
			{
				if(bigrElmnt < a1[j])
				{
					bigrElmnt= a1[j];
				}
			}
			a1[i] = bigrElmnt;
		}
		System.out.println("final:"+Arrays.toString(a1));
	}

}
