package app3_arrays_pack4;
public class Q6 {
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
		System.out.print(fibonaci(i)+",");
		i++;
		}
	}
	static int fibonaci(int i)
	{
		int i1 =0, i2=1;
		if(i==1)
		{
			return 0;
		}
		else if(i==2)
		{
			return 1;
		}
		
		return fibonaci(i-1)+fibonaci(i-2);
	}
}
