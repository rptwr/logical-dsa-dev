package app5_firstMissingPositiveNumbers;

public class M1 {
	public static void main(String[] args) {
		int[] a1 = {1, 6, 5, 8, 4, 3 };
		int length = a1.length;
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i] < 0)
			{
				a1[i] = 0;
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i] <= length)
			{
				a1[a1[i]-1] = -1; 
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i]>0)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
