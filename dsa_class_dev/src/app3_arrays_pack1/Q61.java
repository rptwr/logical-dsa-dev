package app3_arrays_pack1;
/*
remove duplicate
10, 4, 3, 7, 9, 8, 7, 7, 7, 7  //only last element getting duplicated four time
*/

import java.util.Arrays;
class Q61
{
	public static void main(String[] args)
	{
		int[] elements = {1, 2, 1, 10, 4, 5, 6, 4, 5, 1, 2,};
		              //  0  1  2   3  4  5  6   7 8  9  10
		System.out.println("iniital content:" + Arrays.toString(elements));
		int duplicateCount = 0;
		for(int i = 0; i < elements.length - duplicateCount; i++)
		{
			for(int j = i + 1; j < elements.length - duplicateCount; j++)
			{
				if(elements[i] == elements[j])
				{
					for(int k = j; k < elements.length - duplicateCount - 1;k++ )
					{
						elements[k] = elements[k + 1];
					}
					j--;
					duplicateCount ++;
				}
			}
		}
		System.out.println("final content:" + Arrays.toString(elements));
		int[] a1 = new int[elements.length - duplicateCount];
		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = elements[i];
		}
		System.out.println("final:" + Arrays.toString(a1));
	}
}

/*
   {1, 2, 1, 10, 4, 5, 6, 4, 5, 1, 2};
 // 0  1   2  3  4  5  6   7  8 9   10
   
   duplicateCount = 0
   i = 0
   ====================================
       j = 1
	   =========
	      if ==> not executing
	   
	   --------------------------------
	   j = 2
	   =========
	      if ==> executing

	   --------------------------------
	       k = 2
		   ======
		           {1, 2, 10, 10, 4, 5, 6, 4, 5, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 3
		   ======
		           {1, 2, 10, 4, 4, 5, 6, 4, 5, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 4
		   ======
		           {1, 2, 10, 4, 5, 5, 6, 4, 5, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 5
		   ======
		           {1, 2, 10, 4, 5, 6, 6, 4, 5, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 6
		   ======
		           {1, 2, 10, 4, 5, 6, 4, 4, 5, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 7
		   ======
		           {1, 2, 10, 4, 5, 6, 4, 5, 5, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 8
		   ======
		           {1, 2, 10, 4, 5, 6, 4, 5, 1, 1, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10
	       k = 9
		   ======
		           {1, 2, 10, 4, 5, 6, 4, 5, 1, 2, 2};
				 // 0  1   2  3  4  5  6   7  8 9   10

		   duplicateCount = 1
		   j = 1  beacause of j--
          ========
		   j = 2  
		  ========
		     if ==> not executing

		   j = 3
		   ======
		     if ==> not executing
		   j = 4
		   ======
		     if ==> not executing
		   j = 5
		   ======
		     if ==> not executing
		   j = 6
		   ======
		     if ==> not executing
		   j = 7
		   ======
		     if ==> not executing
		   j = 8
		   ======
		     if ==> executing
			 ------------------
			 k = 8
			 ======
			    {1, 2, 10, 4, 5, 6, 4,  5, 2, 2, 2};
			  // 0  1   2  3  4  5  6   7  8  9  10

			 k = 9
			 ======
			   not executing
			 
			 j = 7
			 duplicateCount = 2
			 -------------------
			 j = 8
			 ------
			   if ==> not executing
			  j = 9
			  ------
			  no


*/

/*

		{1, 2, 4, 5, 2, 1, 6};
      // 0  1  2  3  4  5  6

	  i = 0
	  =======
	     j = 1
		 -------
		 if(elements[0] == elements[1])  ==> if(1 == 2) ==> false
	     j = 2
		 -------
		 if(elements[0] == elements[2])  ==> if(1 == 4) ==> false
	     j = 3
		 -------
		 if(elements[0] == elements[5])  ==> if(1 == 5) ==> false
	     j = 4
		 -------
		 if(elements[0] == elements[4])  ==> if(1 == 2) ==> false
	     j = 5
		 -------
				if(elements[0] == elements[5])  ==> if(1 == 1) ==> true
				--------------
				    k = 5
					----------
							{1, 2, 4, 5, 2, 6, 6};   length-1 thats why 6 is not allowed
							// 0  1  2  3  4  5  6
					j = 4
					duplicateCount = 1
		  j = 5
		 -------
				if(elements[0] == elements[5])  ==> if(1 == 6) ==> false

	=======================================================================================================
	i = 1
	---------
	     j = 2
		 -------
		 	  if(elements[1] == elements[2])  ==> if(2 == 4) ==> false
	     
		 j = 3
		 -------
		 	  if(elements[1] == elements[3])  ==> if(2 == 5) ==> false
	     
		 j = 4
		 -------
		 	  if(elements[1] == elements[4])  ==> if(2 == 2) ==> true
			  		k = 4
					--------
							 {1, 2, 4, 5, 6, 6, 6};
							// 0  1  2  3  4  5  6
					j = 3
					duplicateCount = 2
		 j = 4
		 --------
		      if(elements[1] == elements[4])  ==> if(2 == 6) ==> false
		 j = 5
		 --------
		      no

			     			 {1, 2, 4, 5, 6, 6, 6};
							// 0  1  2  3  4  5  6

   i = 2
   ------
===============================================================================================================================
  {3, 4, 3, 5, 6,};
// 0  1   2  3  4

i = 0
-------
   j = 1
   ------
        if(elements[0] == elements[1] ==> if(3 == 4) ==> false
   j = 2
   ------
        if(elements[0] == elements[2] ==> if(3 == 3) ==> true
		   k = 2
		   --------
		          {3, 4, 5, 5, 6,};
				// 0  1  2  3  4
		   k = 3
		   --------
		          {3, 4, 5, 6, 6,};
				// 0  1  2  3  4
=====================================================================================================================================
  {1, 1, 1, 2, 3, 4};
// 0  1   2  3  4 5
		    
i = 0
-------
   j = 1
   ------
        if(elements[0] == elements[1] ==> if(1 == 1) ==> true
		------------------------------------------------------
		 k = 1
		 --------
			   {1, 1, 1, 2, 3, 4};   left-shift by 1 (element 2 is moving to ele1 both are 1) 
			 // 0  1   2  3  4 5 
		 k = 2
		 --------
			   {1, 1, 2, 2, 3, 4};   left-shift by 1 
			 // 0  1   2  3  4 5 
		 k = 3
		 --------
			   {1, 1, 2, 3, 3, 4};   left-shift by 1 
			 // 0  1   2  3  4 5 
		 k = 4
		 --------
			   {1, 1, 2, 3, 4, 4};   left-shift by 1 
			 // 0  1   2  3  4 5
		 j = 0
		 dc = 1

		 j = 1
		 -------------
		    if(elements[0] == elements[1]) ==> if(1 == 1) ==>true
			-----------------------------------------------------
			  k = 1
			    {1, 2, 2, 3, 4, 4};
			  // 0  1   2  3  4 5
			  k = 2
			    {1, 2, 3, 3, 4, 4};
			  // 0  1   2  3  4 5
			  k = 3
			    {1, 2, 3, 4, 4, 4};
			  // 0  1   2  3  4 5

		j = 0
		dc = 2
   j = 1
   ---------
   		if(elements[0] == elements[1]) ==> if(1 == 2) ==>false

*/