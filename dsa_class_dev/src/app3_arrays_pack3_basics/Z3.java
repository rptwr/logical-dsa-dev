package app3_arrays_pack3_basics;
//Read sum of element except first element,last element and middle element.
class Z3
{
	public static void main(String[] args) 
	{
     int[] arr={1,1,3,4,5,6,7,8,6};
	 int sum=0;
	 for (int i =1 ;i<arr.length-1 ;i++ )
	{
		 if (i == (arr.length/2))
		{
			continue;
	    }
		System.out.println(arr[i]);
		sum+=arr[i];
   }

	  System.out.println(sum);
 }
}