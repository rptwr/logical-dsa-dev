package app3_arrays_pack4;
/*
 Write the program
    	 1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
     3 2 1 2 3
       2 1 2
         1
 */
public class Q8 {
	public static void main(String[] args) {
		for(int i =1 ;i<5;i++)
		{

			for(int j =4;j>0;j--)
			{

				if(j<=i)
					System.out.print(j);
				else
					System.out.print(" ");
			} 
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i =3;i>0;i--)
		{
			System.out.print(" ");
			for(int j =3;j>0;j--)
			{
				if(j<=i)
					System.out.print(j);
				else
					System.out.print(" ");
			} 
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
