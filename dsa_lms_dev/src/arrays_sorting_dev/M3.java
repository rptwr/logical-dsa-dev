package arrays_sorting_dev;

//insertion sort
import java.util.Arrays;
class M3
{
	public static void main(String[] args) 
	{
		int[] x = {20, 5, 4, 6, 1, 7, 3, 8, 9, 3, 10, 2};
		         //0   1  2  3  4  5  6  7  8  9  10  11
		System.out.println("initial array content:" + Arrays.toString(x));
		for(int i = 1; i < x.length; i++)
		{
			for(int j = i; j > 0; j--)
			{
				if(x[j] < x[j - 1])
				{
					int temp = x[j];
					x[j] = x[j- 1];
					x[j - 1] = temp;
				}
			}
		}
		System.out.println("final array content:" + Arrays.toString(x));
	}
}

/*
{20, 5, 4, 6, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2  3  4  5  6  7  8  9  10  11

i = 1  
-----
	j = 1
	-----
{5, 20, 4, 6, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2  3  4  5  6  7  8  9  10  11

i = 2
-----
  j = 2 
	---------------
{5,  4, 20, 6, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2  3  4  5  6  7  8  9  10  11

  j = 1 
	---------------
{4,  5, 20, 6, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11

i = 3
------
	j = 3
	-----
{4,  5, 6, 20, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11

	j = 2
	-----
{4,  5, 6, 20, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11

	j = 1
	-----
{4,  5, 6, 20, 1, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11


i = 4
-----
	j = 4
	-----
{4,  5, 6,  1, 20, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11
	j = 3
	-----
{4,  5, 1,  6, 20, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11

	j = 2
	-----
{4,  1, 5,  6, 20, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11

	j = 1
	-----
{1,  4, 5,  6, 20, 7, 3, 8, 9, 3, 10, 2};
0   1  2   3  4  5  6  7  8  9  10  11

i = 5
------
  j = 5
	-----
{1,  4, 5,  6, 7,  20, 3, 8, 9, 3, 10, 2};
0   1  2   3   4  5  6  7  8  9  10  11


i = 6
------
  j  =6
	-----
{1,  4, 5,  6, 7,  3, 20, 8, 9, 3, 10, 2};
0   1  2   3   4  5   6  7  8  9  10  11

  j  =5
	-----
{1,  4, 5,  6,  3,  7, 20, 8, 9, 3, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11

  j = 4
	-----
{1,  4, 5,  3,  6,  7, 20, 8, 9, 3, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11

  j = 3
	-----
{1,  4, 3,  5,  6,  7, 20, 8, 9, 3, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11
  j = 2
	-----
{1,  3, 4,  5,  6,  7, 20, 8, 9, 3, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11


i = 7
-----
	j = 7
{1,  3, 4,  5,  6,  7, 8, 20, 9, 3, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11


i = 8
-----
	j = 8
{1,  3, 4,  5,  6,  7, 8, 9, 20, 3, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11


i = 9
-----
	j = 9
{1,  3, 4,  5,  6,  7, 8, 9, 3, 20, 10, 2};
0   1  2   3   4   5   6  7  8  9  10  11

	j = 8
{1,  3, 4,  5,  6,  7, 8, 3, 9, 20, 10, 2};
0   1  2   3   4   5  6  7  8  9  10  11

	j = 7
{1,  3, 4,  5,  6,  7, 3, 8, 9, 20, 10, 2};
0   1  2   3   4   5  6  7  8  9  10  11


	j = 6
{1,  3, 4,  5,  6,  3, 7, 8, 9, 20, 10, 2};
0   1  2   3   4   5  6  7  8  9  10  11

	j = 5
{1,  3, 4,  5,  3,  6, 7, 8, 9, 20, 10, 2};
0   1  2   3   4   5  6  7  8  9  10  11

	j = 4
{1,  3, 4,  3,  5,  6, 7, 8, 9, 20, 10, 2};
0   1  2   3   4   5  6  7  8  9  10  11


	j = 3
{1,  3, 3,  4,  5,  6, 7, 8, 9, 20, 10, 2};
0   1  2   3   4   5  6  7  8  9  10  11

i = 10
------
j = 10
------
{1,  3, 3,  4,  5,  6, 7, 8, 9, 10, 20, 2};
0   1  2   3   4   5  6  7  8  9   10  11


i = 11
------
 j = 11
 ------
{1,  3, 3,  4,  5,  6, 7, 8, 9, 10, 2, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 10
 ------
{1,  3, 3,  4,  5,  6, 7, 8, 9, 2, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 9
 ------
{1,  3, 3,  4,  5,  6, 7, 8, 2, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 8
 ------
{1,  3, 3,  4,  5,  6, 7, 2, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 7
 ------
{1,  3, 3,  4,  5,  6, 2, 7, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 6
 ------
{1,  3, 3,  4,  5,  2, 6, 7, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11


 j = 5
 ------
{1,  3, 3,  4,  2,  5, 6, 7, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 4
 ------
{1,  3, 3,  2,  4,  5, 6, 7, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11


 j = 3
 ------
{1,  3, 2,  3,  4,  5, 6, 7, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11

 j = 2
 ------
{1,  2, 3,  3,  4,  5, 6, 7, 8, 9, 10, 20};
0   1  2   3   4   5  6  7  8  9   10  11









*/