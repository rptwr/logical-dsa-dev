package app2_display_pattern_pack2;

//Find First Duplicate Element in an Array 

public class Q21 {
	public static void main(String[] args) {
		int[] arr = {6, 3, 5, 4, 5, 2, 2, 1};
		for(int i = 0; i < arr.length; i++)
		{
			int temp = 0;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("First duplicate element in array " + arr[i]);
					temp = temp + 1;
					break;
				}
			}
			if(temp > 0)
			{
				break;
			}
		}
	}
}
