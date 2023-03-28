package app3_arrays_pack4;

import java.util.Arrays;

//Find the Union and Intersection of the two sorted arrays.
public class Q3 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,7,8,8,8};
		int b[] = {1,5,6,7,8,10};
		int unioun[] = new int [a.length+b.length];
		int intercection [] = new int [a.length];
		int k=0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		a:
		for(int i = 0 ; i <a.length ; i++)
		{
			for(int j=0 ; j< b.length;j++)
			{
				if(a[i]==b[j])
				{
					if(k==0)
					{
						intercection[k] = a[i];
						k++;
					}else if(intercection[k-1] != a[i])
					{
						intercection[k] = a[i];
						k++;
					}
					continue a;
				}
			}
		}
		
		int temp[] = intercection;
		intercection = new int[k];
		for(int i=0 ;i<intercection.length; i++)
		{
			intercection[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(intercection));
		int count =0;
		
		int i = 0, j = 0;
		k=0;
        while (i < a.length && j < b.length) {
        	
            if (a[i] <= b[j])
                unioun[k++] = a[i++];
            else if (b[j] < a[i])
            	unioun[k++]= b[j++];
            }
        if(i != a.length)
        {
        	while(i < a.length)
        	{
        		 unioun[k++] = a[i++];
        	}
        }
        if(j != b.length){
        	while(j < b.length)
        	{
        		 unioun[k++] = b[j++];
        	}
        }
        count=1;
        for(i=1;i<unioun.length;i++)
        {
        	if(unioun[i-1]==unioun[i])
        	{
        		continue;
        	}
        	unioun[count++] = unioun[i];
        }
        int temp1[] =unioun;
        unioun = new int[count];
        for( i =0 ; i<count;i++)
        {
        	unioun[i]=temp1[i];
        }
        	
		System.out.println(Arrays.toString(unioun));
	}
}
