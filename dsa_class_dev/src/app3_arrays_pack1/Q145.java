package app3_arrays_pack1;

/*
Write a program to find those pair of elements that has the 
maximum and minimum difference among all element pairs.

*/
import java.util.Arrays;
class Q145
{
	public static void main(String[] args) 
	{
		int[] a= {2,4,5,6,7,8,9,23,45,87,98,200,50,20};
		int diff = 0,minDiff = Integer.MAX_VALUE,maxDiff = Integer.MIN_VALUE, index1 = 0, index2=0;
		for (int i = 0;i<a.length-1;i++)
		{
          diff = getAbsDiff(a[i]-a[i+1]);
		   if (minDiff>diff)
		   {
			  minDiff=diff;
			  index1 = i;
		   }
		   if (maxDiff<diff)
		   {
			   maxDiff=diff;
			   index2 = i;
		   }
		}
		System.out.println(a[index1] + ", "+ a[index1+1]);
		System.out.println(a[index2] + ", "+ a[index2+1]);
	}
	static int getAbsDiff(int diff)
	{
		if (diff<0)
		{
			diff = diff*(-1);
		}
		return diff;
	}
}