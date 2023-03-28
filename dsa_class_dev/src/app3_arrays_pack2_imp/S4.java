package app3_arrays_pack2_imp;
/*
Swap even number with the next immediate even number
and continue like this till to end and also
Swap odd number with the next immediate odd number
and continue like this till to end
*/
import java.util.Arrays;
class S4
{
	public static void main(String[] args) 
	{
		int a[]={10,9,12,3,8,5,4,7};
		System.out.println("initial"+Arrays.toString(a));
		b:
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]%2==0)
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
						i=j;
						continue b;
					}
				}
			}
		}
		c:
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==1)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]%2==1)
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
						i=j;
						continue c;
					}
				}
			}
			
		}

	System.out.println("final"+Arrays.toString(a));
	}
}
