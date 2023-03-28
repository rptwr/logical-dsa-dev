package app6_control_statements;

// Read a string in reverse order

public class Q12 {
	public static void main(String[] args) {
		String name = "Ravi";
		String rev = " ";
		for(int i = name.length() - 1; i >= 0; i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}
}
