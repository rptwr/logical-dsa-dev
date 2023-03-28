package app3_arrays_pack1;
/*
1 : unit
40: tens
100: hundreds
20:
*/
import java.util.Arrays;
class C3 
{
	public static void main(String[] args) 
	{
		int[] a1 = {1, 40, 100, 20, 900, 4, 30, 550, 3};
		//System.out.println("Inital:" + Arrays.toString(a1));
		for(int i = 1; i < a1.length; i++)
		{
			if(a1[i] < 10 && a1[i] > 0)
			{
				System.out.println(a1[i] + ":" + "unit" );
			}
			else if(a1[i] < 100 )
			{
				System.out.println(a1[i] + ":" + "tens" );
			}
			else if(a1[i] < 1000)
			{
				System.out.println(a1[i] + ":" + "hundreds" );
			}
		}
	}
}
