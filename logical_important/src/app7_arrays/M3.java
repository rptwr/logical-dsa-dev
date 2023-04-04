package app7_arrays;

import java.util.Arrays;

public class M3 {
	public static void main(String[] args) {
		int[] nums = {9,12,5,10,14,3,10};
		int p = 10;
		int[] a1 = new int[nums.length];
		int j = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] < p)
			{
				a1[j++] = nums[i];
			}
		}
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] == p)
			{
				a1[j++] = nums[i];
			}
		}
		for(int i = 0; i < nums.length;i++)
		{
			if(nums[i] > p)
			{
				a1[j++] = nums[i];
			}
		}
		System.out.println(Arrays.toString(a1));
	}
}
