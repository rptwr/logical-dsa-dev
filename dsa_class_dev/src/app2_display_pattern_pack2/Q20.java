package app2_display_pattern_pack2;

import java.util.HashSet;
import java.util.Set;

//Find Duplicate Elements in an Array


public class Q20
//{
//	public static void main(String[] args) {
//		int[] arr = {3, 5, 4, 3, 2, 2, 1};
//		System.out.println("duplicate valus are: ");
//		for(int i = 0; i < arr.length - 1; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if((arr[i] == arr[j]) && (i != j))
//				{
//					System.out.print(arr[j] + ", ");
//				}
//			}
//		}
//	}
//}


/*
 BRUTE FORCE METHOD
--> If any element repeating only one time then we can apply brut forc 
 */

//==================================================

{
	public static void main(String[] args) {
		int[] arr = {3, 5, 4, 2, 2, 1};
		System.out.println("ducate elements are: ");
		Set list = new HashSet();
		for(int num : arr)
		{
			if(list.add(num) == false)
			{
				System.out.println(num + " ");
			}
		}
			
	}
}