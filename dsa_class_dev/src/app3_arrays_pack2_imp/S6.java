package app3_arrays_pack2_imp;
/*
There is an array with every element repeated twice except
one. Find that element?
{8, 1, 7, 1, 2, 6, 8, 2, 3, 4, 4, 5,7, 5, 6}
3
*/
class S6
{
	public static void main(String[] args) 
	{
		int a[]={8, 1, 7, 1, 2, 6, 8, 2, 3, 4, 4, 5,7, 5, 6};
		System.out.print("non repeted elemet in give array is :");
		b:
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
				continue b;
				}
			}

			System.out.print(a[i]);
		}

	}
}
