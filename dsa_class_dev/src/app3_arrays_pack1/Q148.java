package app3_arrays_pack1;

/*
There is an array with every element repeated twice except 
one. Find that element?
{8, 1, 7, 1, 2, 6, 8, 2, 3, 4, 4, 5,7, 5, 6}
ans: 3

*/

import java.io.*;
import java.util.Arrays;
class Q148
	{
 
  static int findSingle(int A[], int ar_size)
  {
 
    for (int i = 0; i < ar_size; i++) {
      int count = 0;
      for (int j = 0; j < ar_size; j++) {
        if (A[i] == A[j]) {
          count++;
        }
      }
      if (count == 1) {
        return A[i];
      }
    }
    return -1;
  }
 
  public static void main (String[] args) {
    int ar[] = {8, 1, 7, 1, 2, 6, 8, 2, 3, 4, 4, 5,7, 5, 6};
	System.out.println("Initial:" + Arrays.toString(ar));
    int n = ar.length;
 
    System.out.println("Non repeated element:" + findSingle(ar, n));
  }
}
