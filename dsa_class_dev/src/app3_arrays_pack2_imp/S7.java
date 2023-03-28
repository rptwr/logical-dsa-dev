package app3_arrays_pack2_imp;
/*
How find the first repeating element in an array of integers?
*/
class S7
{
	public static void main(String[] args) 
	{
		int a[]={8, 1, 7, 1, 2, 6, 8, 2, 3, 4, 4, 5,7, 5, 6};
		int i=0;
		b:
		for(i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] )
				{
					break b;
				}
			}
		}
		System.out.println("first repeating element in given array : "+a[i]);
	}
}

