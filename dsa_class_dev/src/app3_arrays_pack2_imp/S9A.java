package app3_arrays_pack2_imp;
/*
Find the length of the longest consecutive elements
sequence.
[10, 100, 5, 20, 4, 200, 1, 3, 25, 15, 2],
The longest consecutive elements sequence is [1, 2, 3, 4, 5].
Return its length: 5
*/
import java.util.Arrays;
class S9A
{
	public static void main(String[] args) 
	{
		int a[]={10,6,8,100,20,5,4,200,1,3,25,7,15,2};
		int sequene=0;
		for(int i=0;i<a.length;i++)
		{
			int sequene1=sequence( a,i);
			if(sequene1>sequene)
			{
				sequene=sequene1;
			}
		}
		System.out.println("Return its length :"+sequene);
		
	}
	static int sequence(int a[],int i)
	{
		int seuence=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==i)
			{
				++seuence;
				++i;
				j=0;
			}
		}
		return seuence;
	}
	
}