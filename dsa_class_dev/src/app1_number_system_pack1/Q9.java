package app1_number_system_pack1;
/*
read digit from left to right.
*/
class Q9
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("please enter digit n");
			return;
		}
		int i = Integer.parseInt(args[0]);   // 12347
		int factor = 1;
		int j = i;
		while(j != 0)
		{
			factor = factor * 10;
			j = j / 10;
		}
		factor = factor / 10;
		int digit;
		while(i != 0)
		{
			digit = i / factor;
			System.out.println(digit);
			i = i % factor;
			factor = factor / 10;
		}
	}
}





/*
while loop five time   === 10power 5 === 100000
factor becoming 100000  and j -- 0
---------------
factor = factor / 10
factor = 100000 / 10   = 10000
--------------
12347 / 10000 === 1
1 is printing
12347 % 10000 == 2347   i become 2347
factor 10000 / 10 === 1000
*/




