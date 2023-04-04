package app4_arrayLogical;

public class Q6 {
	public static void main(String[] args) {
		int[] blockHeights = {2, 0, 1, 2, 1, 3, 2, 0, 3, 1, 2};
		int leftMax = 0, rightMax = 0, minMax, waterCapacity = 0;		
		for(int i = 1; i < blockHeights.length - 1; i++)
		{
			leftMax = rightMax = 0;
			for(int j = 0; j <  i; j++)
			{
				if(leftMax < blockHeights[j])
				{
					leftMax = blockHeights[j];
				}
			}
			for(int j = i + 1; j <  blockHeights.length; j++)
			{
				if(rightMax < blockHeights[j])
				{
					rightMax = blockHeights[j];
				}
			}
			minMax = leftMax < rightMax ? leftMax : rightMax ;
			if(minMax > 0 && (minMax - blockHeights[i]) > 0)
			{
				waterCapacity += (minMax - blockHeights[i]);
			}
		}
		System.out.println(waterCapacity);		
	}
}
