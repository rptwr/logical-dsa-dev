package app3_arrays_pack1;

/*
if three numbers cont incrementing then doble the next elmnt
{10, 20, 200, 60, 10, 40, 60, 600, 10, 10};
*/
import java.util.Arrays;
class Q95
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 200, 30, 10, 40, 60, 300, 5, 10};
		System.out.println("Inital:" + Arrays.toString(a1));
		for(int i = 1; i < a1.length - 1; i++)
		{
			if (a1[i - 1] < a1[i] && a1[i] < a1[ i + 1])
			{
				a1[i + 2] = a1[i + 2] * 2;  
			}
		}
			System.out.println("Final:" + Arrays.toString(a1));
	}
}
