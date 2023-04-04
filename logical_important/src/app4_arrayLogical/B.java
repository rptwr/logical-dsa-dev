package app4_arrayLogical;

public class B {
	public static void main(String[] args) {
		int[] a1 = {1 , 2 , 4 , 10 , 15 , 16 , 1 , 2 , 8 , 4 , 4 , 8 , 5 , 6};
		int k ;
		for(int i = 0 ; i < a1.length; i++)
		{
			k = a1[i];
			for (int j = i; j < a1.length; j++) 
			{
				if(2*k == a1[j])
				{
					System.out.println(k+" at index "+i+" and its double is "+ a1[j] + " at index "+	 j);
					break;
				}
			}
		}
	}
}
