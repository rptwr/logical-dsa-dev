package app2_display_pattern_pack2;
//Find second largest element in an array

public class Q18
//{
//	public static void main(String[] args) {
//		int[] arr = {5, 3, 7, 6, 9, 8, 10};
//		int temp;
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] < arr[j])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			if(i == 1)
//			{
//				break;
//			}
//		}
//		
//		System.out.println("Second largest element in an array " + arr[1]);
//	}
//}


//{
//	public static void main(String[] args) {
//		int[] arr = {5, 3, 7, 6, 9, 8, 10};
//		int temp;
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] > arr[j])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//
//		}
//		System.out.print("Second Smallest Element in array " + arr[1]);
//	}
//}



//========================================================

{
	public static void main(String[] args) {
		int[] arr = {5, 3, 7, 6, 9, 8, 10};
		int largest = Integer.MIN_VALUE;  // -214783648
		int second_largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				second_largest = largest;
				largest = arr[i];
			}
			else if(arr[i] > second_largest && arr[i] != largest)
			{
				second_largest = arr[i];
			}	
		}
		if(second_largest == Integer.MIN_VALUE)
		{
			System.out.println("There is no Second Largest Element in  the list");
		}
		else
		{
			System.out.println("Second largest element " + second_largest);
		}
	}
}