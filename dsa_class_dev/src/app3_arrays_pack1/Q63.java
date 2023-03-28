package app3_arrays_pack1;
// retain a2 elements from a1.
import java.util.Arrays;
class Q63
{
	public static void main(String[] args) 
	{
		int[] a1 = {10,20,30,40,50,4,6,9,100,1,6};
		int[] a2 = {300,50,90,100,34,66,1,12,80,6};
        int count=0;
        boolean isAvailable;
		for (int i =0;i<a1.length-count;i++)
		{
			isAvailable = false;
			for (int j =0;j<a2.length;j++)
			{
				if (a1[i]==a2[j])
				{
					isAvailable = true;
					break;
				}
			}
			if (!isAvailable)
			{
				for (int k = i;k<a1.length-count-1;k++)
				{
					a1[k]=a1[k+1];
				}
				i--;
				count++;
			}
		}
		int[] temp =a1;
		a1 = new int[a1.length-count];
		for (int i =0;i<a1.length;i++)
		{
			a1[i]=temp[i];
		}
		System.out.println(Arrays.toString(a1));
	    System.out.println(Arrays.toString(a2));
	}
}