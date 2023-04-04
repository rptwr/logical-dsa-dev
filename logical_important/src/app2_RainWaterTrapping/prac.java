package app2_RainWaterTrapping;

import java.util.Arrays;

public class prac {
	public static void main(String[] args) {
		int[] heights = {2, 1, 4, 0, 3, 0, 1, 2, 0, 3, 0, 2};
		System.out.println(Arrays.toString(heights));
		int [] leftMax = new int[heights.length];
		leftMax[0] = heights[0];
		int[] rightMax = new int[heights.length];
		rightMax[rightMax.length-1] = heights[heights.length-1];
		for (int i = 1; i < heights.length; i++) 
		{
			if(leftMax[i-1] > heights[i])
			{
				leftMax[i] = leftMax[i-1];
			}
			else
			{
				leftMax[i] = heights[i];
			}
		}
		System.out.println(Arrays.toString(leftMax));
		for (int i = heights.length-2; i >= 0; i--) 
		{
			if(rightMax[i+1] > heights[i])
			{
				rightMax[i] = rightMax[i+1];
			}
			else
			{
				rightMax[i] = heights[i];
			}
		}
		System.out.println(Arrays.toString(rightMax));
		int capacity = 0 ,leftM,rightM,minM,current;
		for (int i = 1; i < heights.length; i++) 
		{
			leftM = leftMax[i];
			rightM = rightMax[i];
			current = heights[i];
			minM = leftM < rightM ? leftM : rightM ;
			if(current < minM)
			{
				capacity += (minM-current);
			}
		}
		System.out.println(capacity);
		
	}

}
