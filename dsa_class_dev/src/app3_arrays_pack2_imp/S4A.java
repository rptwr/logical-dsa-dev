package app3_arrays_pack2_imp;
/*
Swap even number with the next immediate even number
and continue like this till to end and also
Swap odd number with the next immediate odd number
and continue like this till to end
*/
//not done
import java.util.Arrays;
class S4A
{
	public static void main(String[] args) 
	{
		int a[]={10,9,12,3,8,5,4,7};
		System.out.println(Arrays.toString(a));
		b:
		for(int i=0,k=0,l=0;l<a.length-1;l++)
		{
			i=i<l?l:i;
			k=k<l?l:k;
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
						i++;
						continue b;
					}
				}
			}
			if(a[k]%2==0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]%2==0)
					{
						int temp=a[j];
						a[j]=a[k];
						a[k]=temp;
						k=j;
						k++;
						continue b;
					}
				}
			}
			
		}
	System.out.println(Arrays.toString(a));
	}
}
