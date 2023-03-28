package app3_arrays_pack1;
class A11 
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 3, 40, 0, 500, 110, 5, 80};
		         // 0   1   2  3   4    5   6   7
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < a1.length; i += 2)
		{
			evenSum += a1[i];
		}
		for(int i = 1; i < a1.length; i += 2)
		{
			oddSum += a1[i];
		}
		System.out.println(evenSum > oddSum ? "evenSum is bigger" : "oddSum is bigger");
	}
}
