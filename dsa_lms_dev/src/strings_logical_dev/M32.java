package strings_logical_dev;
import java.util.Scanner;
class M32
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String s1 = "btm is java";
		//             012345678910
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int shortestWordLength = s1.length(), shortestWordFromIndex = 0, shortestWordEndIndex = s1.length();
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		while(toIndex != -1)
		{
			if(shortestWordLength > (toIndex - fromIndex))
			{
				shortestWordLength = (toIndex - fromIndex);
				shortestWordFromIndex = fromIndex;
				shortestWordEndIndex = toIndex;
			}
			fromIndex = toIndex + 1;			
			toIndex = s1.indexOf(' ', fromIndex);
		}
		if(shortestWordLength > (s1.length() - fromIndex))
		{
			shortestWordFromIndex = fromIndex;
			shortestWordEndIndex = s1.length();
		}
		String shortestWord = s1.substring(shortestWordFromIndex, shortestWordEndIndex);
		System.out.println(shortestWord);			
	}
}
