package app4_arrayLogical;

public class Q2 {
	public static void main(String[] args) {
		int[] a1 = {1, 4, 7, 9, 100, 90, 7, 0};
		int[] a2 = {1 ,4 ,7 ,2 ,9 ,100 ,90 ,7 ,0};
		int[] a3 = {1 ,4 ,7 ,9 ,100 ,297 ,700 ,800};
		//a1=a3;
		boolean b1 = true , isMountain = true;
		if(a1.length < 3)
		{
			System.out.println(false);
			return;
		}
		for (int i = 0; i < a1.length-2; i++)
		{
			if(b1)
			{
				if(a1[i] > a1[i+1])
				{
					b1 = false;
				}
			}
			else
			{
				if(a1[i] < a1[i+1])
				{
					isMountain = false;
					break;
				}
			}
		}
		System.out.println(!b1 && isMountain);
	}
}
