package app4_strings_pack3_set1;

// Print the nearest space location from the middle of a string


public class Q50 
{
	public static void main(String[] args) {
		String s1 = "r qs sq sq";
				//   0123456789
		int midIndex = s1.length() / 2;
		int leftIndex = s1.lastIndexOf(' ', midIndex);  
		int rightIndex = s1.indexOf(' ', midIndex);  
		System.out.println(leftIndex);
		System.out.println(rightIndex);
		System.out.println((rightIndex - midIndex) > (midIndex - leftIndex) ? leftIndex : rightIndex);
	}
}