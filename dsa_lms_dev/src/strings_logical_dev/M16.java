package strings_logical_dev;
class M16
{
	public static void main(String[] args) 
	{
		String s1 = "java is better than apple";
		//           0123
		for(int i = s1.indexOf('a'); i != -1; i = s1.indexOf('a', i + 1))
		{
			System.out.println(i);
		}
	}
}
