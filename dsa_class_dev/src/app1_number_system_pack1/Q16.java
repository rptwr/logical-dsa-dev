package app1_number_system_pack1;
/*
reverse first half and second separately
*/

class Q16 
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("pls supply one int command line args");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = i, k = i;
		int count = 0;
		while (j != 0)
		{
			count++;
			j = j / 10;
		}
		int factor = 1;
		for(int m = 1; m <= count / 2; m++)
		{
			factor *= 10;
		}
		int firstHalf = i / factor;
		int secondHalf = i % factor;
		int revFirstHalf = 0;
		while (firstHalf != 0)
		{
			revFirstHalf = revFirstHalf * 10 + firstHalf % 10;
			firstHalf = firstHalf / 10;
		}
		System.out.println(firstHalf);
		int reversedFirstHalfAndReversedSecondHalf = revFirstHalf;
		while (secondHalf != 0)
		{
			reversedFirstHalfAndReversedSecondHalf = (reversedFirstHalfAndReversedSecondHalf * 10) + (secondHalf % 10);
			secondHalf = secondHalf / 10;
		}
		System.out.println("given number is :" + i);
		System.out.println("and the final num is :" + reversedFirstHalfAndReversedSecondHalf);


	}
}