package app2_display_pattern_pack2;

//Find Minimum and maximum values in an array

public class Q17 
//{
//	public static void main(String[] args) {
//			int[] arr = {4, 3, 5, 2, 8, 6};
//			int max = arr[0];
//			for(int i = 1; i < arr.length; i++)
//			{
//				if(arr[i] > max)
//				{
//					max = arr[i];
//				}
//			}
//			System.out.println(max);
//	}
//}



//====================Minimum value in array===================================

{
	public static void main(String[] args) {
		int[] arr = {40, 50, 20, 60, 70, 90, 1};
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
