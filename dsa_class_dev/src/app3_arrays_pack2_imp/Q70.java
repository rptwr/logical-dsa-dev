package app3_arrays_pack2_imp;
import java.util.Arrays;
class Q70
{
	public static void main(String[] args) 
	{
		int[] elements= {1,2,1,10,4,5,6,4,5,1,2,7};
		System.out.println("initial content: "+ Arrays.toString(elements));
		int duplicateCount = 0;
		for (int i=0; i < elements.length - duplicateCount; i++)
		{
			for (int j = i+1; j< elements.length - duplicateCount; j++ )
			{
				if (elements[i] == elements[j])
				{
					for (int k = j;k<elements.length-duplicateCount-1 ;k++ )
					{
						elements[k] = elements[k+1];
					}
					j--;
					duplicateCount++;
				}
			}
		}
		System.out.println("final content: "+ Arrays.toString(elements));
		int [] a1 = new int [elements.length - duplicateCount];
			for (int i = 0; i<a1.length; i++)
			{
			   a1[i] = elements[i];
			}
		System.out.println("final content: "+ Arrays.toString(elements));


	}
}
/*
							{1,2,1,10,4,5,6,4,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10

							duplicateCount = 0
							i = 0
							------------------
							j = 1
							if==> not executing
							---------------------
							j=2
							if ==> executing
							----------------------
							k=2

							{1,2,10,10,4,5,6,4,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=3
							{1,2,10,4,4,5,6,4,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=4
							{1,2,10,4,5,5,6,4,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=5
							{1,2,10,4,5,6,6,4,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=6
							{1,2,10,4,5,6,4,4,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=7
							{1,2,10,4,5,6,4,5,5,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=8
							{1,2,10,4,5,6,4,5,1,1,2};
							0 1 2  3 4 5 6 7 8 9 10
							k=9
							{1,2,10,4,5,6,4,5,1,2,2};
							0 1 2  3 4 5 6 7 8 9 10


			duplicateCount = 1
			j  = 1
			------------------
			j = 2
			------
			  if ==> not executing
		    j = 3
			  if ==> not executing
			j = 4
			  if ==> not executing
			j = 5
			  if ==> not executing
			j = 6
			  if ==> not executing
			j = 7
			  if ==> not executing
			j = 8
			  if ==>  executing
		----------------------------
		k = 8
		------
		                   {1,2,10,4,5,6,4,5,2,2,2};
							0 1 2  3 4 5 6 7 8 9 10
		k = 9
		no execute.



		j = 7
		duplicateCount = 2
		------------------------
		j = 8
		-----
		  if ==> not executing


							
							
*/