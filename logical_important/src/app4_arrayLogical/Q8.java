package app4_arrayLogical;

import java.util.Arrays;

public class Q8 {
	public static void main(String[] args) {
		Object[] elements = {"test", 10, 4.5, 5, 2, 1.4, "xyz", "hello", 4, 9, 1.4};
		System.out.println(Arrays.toString(elements));
		int left = 0, right = elements.length - 1;
		Object temp;
		while(true)
		{
			while(elements[left] instanceof String)
			{
				left++;
			}
			while(elements[right] instanceof Number)
			{
				right--;
			}
			if(left >= right)
			{
				break;
			}
			temp = elements[left];
			elements[left] = elements[right];
			elements[right] = temp;
			left++;
			right--;
		}
		left = 0;
		while(true)
		{
			if(elements[left] instanceof Number)
			{
				break;
			}
			left ++;
		}		
		int stringsCount = left;
		right = elements.length - 1;
		while(true)
		{
			while(elements[left] instanceof Integer)
			{
				left++;
			}
			while(elements[right] instanceof Double)
			{
				right--;
			}
			if(left >= right)
			{
				break;
			}
			temp = elements[left];
			elements[left] = elements[right];
			elements[right] = temp;
			left++;
			right--;
		}
		System.out.println("Total number of strings:" + stringsCount);
		System.out.println("total number of int:" + (left - stringsCount));
		System.out.println("total number of doubles:" + (elements.length - left));
		System.out.println(Arrays.toString(elements));
		int stringsStartingIndex = 0 , stringsEndingIndex = stringsCount -1;
		int intStartingIndex = stringsEndingIndex + 1, intEndingIndex = left -1;
		int doubleStartingIndex = left , doubleEndingIndex = elements.length-1;
//		System.out.println(stringsStartingIndex);
//		System.out.println(stringsEndingIndex);
//		System.out.println(intStartingIndex);
//		System.out.println(intEndingIndex);
//		System.out.println(doubleStartingIndex);
//		System.out.println(doubleEndingIndex);
		
		sortStrings(stringsStartingIndex,stringsEndingIndex,elements);
		sortInteger(intStartingIndex,intEndingIndex,elements);
		sortDoubles(doubleStartingIndex,doubleEndingIndex,elements);
		System.out.println("final arrays:" + Arrays.toString(elements));
	} 
	static void sortStrings(int from , int to , Object[] elements)
	{
		String s1 , s2 ,temp ;
		for(int i = from; i<to;i++)
		{
			for(int j = i ; j< to ; j++)
			{
				s1 = (String) elements[i];
				s2 = (String) elements[i +1];
				if(s1.compareTo(s2) > 0)
				{
					elements[i] = s2;
					elements[i+1] =s1;
				}
			}
		}
	}
	static void sortInteger(int from, int to , Object[] elements)
	{
		Integer s1 , s2  ;
		for(int i = from; i<to;i++)
		{
			for(int j = i ; j< to ; j++)
			{
				s1 = (Integer) elements[i];
				s2 = (Integer) elements[i +1];
				if(s1.compareTo(s2) > 0)
				{
					elements[i] = s2;
					elements[i+1] =s1;
				}
			}
		}
	}
	static void sortDoubles( int from , int to ,Object[] elements)
	{
		Double s1 , s2  ;
		for(int i = from; i<to;i++)
		{
			for(int j = i ; j< to ; j++)
			{
				s1 = (Double) elements[i];
				s2 = (Double) elements[i +1];
				if(s1.compareTo(s2) > 0)
				{
					elements[i] = s2;
					elements[i+1] =s1;
				}
			}
		}
	}
}
