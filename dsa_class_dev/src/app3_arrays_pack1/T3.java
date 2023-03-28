package app3_arrays_pack1;
/*
Insert a new element at the last 3rd location from last
*/
import java.util.Arrays;
class T3
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 4, 6, 9, 100, 1, 6};
		System.out.println(Arrays.toString(a1));
		int[] a2 = a1;
		a1 = new int[a2.length + 1];
		for(int i = 0; i < a2.length; i++)
		{
			a1[i] = a2[i];
		}
		for(int i = a1.length - 1; i > a1.length - 4; i--)
		{
			a1[i] = a1[i - 1];
		}
		a1[a1.length - 4] = 500;
		System.out.println(Arrays.toString(a1));
	}
}

//at original place of 100 we have to insert new elmnt so we will take length - 4
