package app3_arrays_pack1;

/*
How find the first repeating element in an array of integers?

*/
import java.util.*;
 
class Q149 {
    static void printFirstRepeating(int arr[])
    {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;
            else
                set.add(arr[i]);
        }
        if (min != -1)
            System.out.println(
                " First repeating element: "
                + arr[min]);
        else
            System.out.println(
                "No repeating elements");
    }
    public static void main(String[] args)
        throws java.lang.Exception
    {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6, 10 };
		System.out.println("Initial:" + Arrays.toString(arr));
        printFirstRepeating(arr);
    }
}