//rain water trapping
package app3_arrays_pack2_imp;

import java.util.Arrays;

public class M4 {
	public static void main(String[] args) {
		int[] heights = {2, 1, 4, 0, 3, 0, 1, 2, 0, 3, 0, 2};
		System.out.println(Arrays.toString(heights));
		int[] leftMaxValues = new int[heights.length];
		leftMaxValues[0] = heights[0];
		for (int i = 1; i < heights.length; i++)
		{
			if (leftMaxValues[i - 1] > heights[i])
			{
				leftMaxValues[i] = leftMaxValues[i - 1];
			}
			else
			{
				leftMaxValues[i] = heights[i];
			}
		}
//		System.out.println(Arrays.toString(leftMaxValues));
		int[] rightMaxValues = new int[heights.length];
		rightMaxValues[heights.length - 1] = heights[heights.length - 1];
		for (int i = heights.length - 2; i >= 0; i--)
		{
			if (heights[i] > rightMaxValues[i + 1])
			{
				rightMaxValues[i] = heights[i];
			}
			else
			{
				rightMaxValues[i] = rightMaxValues[i + 1];
			}
		}	
//		System.out.println(Arrays.toString(rightMaxValues));
		int leftMax, rightMax, minMax, current, capacity = 0;		
		for (int i = 1; i < heights.length - 1; i++)
		{
			leftMax = leftMaxValues[i];
			rightMax = rightMaxValues[i];
			minMax = leftMax < rightMax ? leftMax : rightMax ;
			current = heights[i];
			if (current < minMax)
			{
				capacity += (minMax - current);
			}
		}
		System.out.println(capacity);		
	}
}