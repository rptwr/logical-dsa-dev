package app3_arrays_pack3_basics;
/*
Find the sum of all elements except first element,last element and middle element
*/
class Z2
{
	public static void main(String[] args) 
	{
	  int[] array={2,5,25,10,200,1,3,10,8};
	  int sum=0;          
	  int half=array.length/2;
	  int i,j;
	  for ( i=1,j=array.length-2;i<half ;i++,j--)
	  {
       sum+=array[i]+array[j];
	  System.out.println(array[i]);
	  System.out.println(array[j]);
	  }
	  System.out.println(sum);
	}
}
	  /*
       for (int i=1;i<array.length/2 ;i++ )
       {
		  firsthalf+=array[i]; 
       }
       for (int i=(array.length/2+1);i<array.length-1 ;i++ )
       {
		  secondhalf+=array[i]; 
       }
	   System.out.println(sum=firsthalf+secondhalf);

  */