package app3_arrays_pack1;

/*
How to find first non-repeating element in array of integers?

*/
import java.util.Arrays;
class Q150 {

   static int firstNonRepeating(int arr[], int n)
   {
       for (int i = 0; i < n; i++) {
           int j;
           for (j = 0; j < n; j++)
               if (i != j && arr[i] == arr[j])
                   break;
           if (j == n)
               return arr[i];
       }

       return -1;
   }
   public static void main(String[] args)
   {

       int arr[] = { 9, 4, 9, 6, 7, 4 };
		System.out.println("Inital:" + Arrays.toString(arr));
       int n = arr.length;
       System.out.print("First Non Repeating Element:" + (firstNonRepeating(arr, n)));
   }
}
