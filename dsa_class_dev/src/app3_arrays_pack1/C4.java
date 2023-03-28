package app3_arrays_pack1;
/*
print which are surrounded with lesser number
*/
import java.util.Arrays;
class C4
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 2, 30, 10, 40, 30, 300, 5, 10};
		System.out.println("Inital:" + Arrays.toString(a1));
		for(int i = 1; i < a1.length - 1; i++)
		{
			if (a1[i] > a1[i - 1] && a1[i] > a1[i + 1])
			{
               System.out.print(a1[i] + ", ");
			}
		}
	}
}
