package app4_strings_pack2_basics;

// string to char array

public class Q35
{
	public static void main(String[] args) {
		String s1 = "abc hello test 123";
		char[] chars = s1.toCharArray();
		for(char c1 : chars)
		{
			System.out.print(c1 + ", ");
		}
	}
}

// toCharArray()  -- it converts string into char array

//
//class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int[] arr = new int[2*n];
//        for(int i = 0; i < n; i++){
//            arr[i] = nums[i];
//            arr[i + n] = nums[i];
//        }
//        return arr;
//    }
//}