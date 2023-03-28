package app3_arrays_pack2_imp;
/*
How find the first non-repeating element in an array of integers?
*/
class S8
{
	public static void main(String[] args) 
	{
		int a[]={8, 1, 7, 1, 2, 6, 8, 2, 3, 4, 4, 5,7, 5, 6};
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
			System.out.println("first non-repeating element in an array : "+a[i]);
			break;
		}
		
	}
}

