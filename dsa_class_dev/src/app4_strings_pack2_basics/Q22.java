package app4_strings_pack2_basics;

public class Q22 
{	
	public static void main(String[] args) {
		if(args.length < 2)
		{
			System.out.println("pls supply two string args");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		System.out.println("given strings :");
		System.out.println("first one :" + s1);
		System.out.println("2nd one :" + s2);
		int i = s1.indexOf(s2);
		if(i != -1)
		{
			System.out.println(s2 + " is available at " + i);
		}
		else
		{
			System.out.println(s2 + " is not available at " + i);
		}
	}
}

