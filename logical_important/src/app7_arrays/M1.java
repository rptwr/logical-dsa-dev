package app7_arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class M1 {
	public static void main(String[] args) {
		int[] nums = {-1,2,-8,3,6,-7,4};
		ArrayList <Integer> list = new ArrayList();
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
        	if(nums[i] > 0)
        	{
        		int cur = nums[i];
	            for(int j = 0 ; j < nums.length; j++)
	            {
	                if(nums[j] == -cur)
	                {
	                    list.add(cur);
	                }
	            }
        	}
        }
        Collections.sort(list);
        if(list.isEmpty())
        	return;
        System.out.println(list.get(list.size()-1));
	}
}
