package strings_logical_dev;
class M26 
{
	public static void main(String[] args) 
	{
		String s1 = "abc xyz";
		//           0123456
		String s2 = s1.substring(0, 3);
		String s3 = s1.substring(4, 7);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
