package app4_arrayLogical;

import java.util.Arrays;
//binary search
public class M1 {
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
		System.out.println(Arrays.toString(a1));
		int left = 0,right = a1.length-1,search = 3, mid , midElement;
		while(left <= right)
		{
			mid = left + ((right- left)/2); 
			midElement = a1[mid];
			if(midElement == search)
			{
				System.out.println(search +" available at " + mid);
				break;
			}
			if(midElement > search)
			{
				right = mid - 1;
			}
			else
			{
				left = left + 1;
			}
		}
	}

}
