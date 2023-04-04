package app7_arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class M2 {
	public static void main(String[] args) {
		int [] arr = {1,0,2,3,0,4,5,0};
		 ArrayList<Integer> list = new ArrayList();
	        for(int i = 0 ; i< arr.length;i++)
	        {
	            list.add(arr[i]);
	            if(arr[i]==0)
	            {
	                list.add(arr[i]);
	            }
	        }
	        System.out.println(list);
	        int[]a1 = arr;
	        arr = new int[arr.length];
	        for(int i = 0 ; i < arr.length;i++)
	        {
	            arr[i] = list.get(i);
	        }
	        System.out.println(Arrays.toString(arr));
	}
}
