package java_string;

public class M12 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = s1 + s1; // String s2 = "nullnull"   // + operator it adds any thing  // genrating nullnull 
		String s3 = s1 + 10;
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s1.length());
		
	}
}


/*
null can be added to another null finally making it nulnull

 */