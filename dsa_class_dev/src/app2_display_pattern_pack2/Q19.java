package app2_display_pattern_pack2;
//Find kth Largest and Smallest Element in Array Java

public class Q19 {
	public static void main(String[] args) {
		int[] arr = {5, 8, 12, 7, 6, 2, 4};
		int k = 4;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == k - 1)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		System.out.println("--------------");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}