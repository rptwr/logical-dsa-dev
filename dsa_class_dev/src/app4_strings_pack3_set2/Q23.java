package app4_strings_pack3_set2;

// Print middle 2 words?
public class Q23
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZSS TEST HELLO";
//		
//	}
//}

{
	public static void main(String[] args) {
		int[] nums = {2, 2, 1, 1, 4, 4, 5, 6, 6};
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			count = 0;
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
			}
			if(count == 2) {
			 System.out.println(nums[i]);
			}
		}
	}
}

//class Solution {
//    public int singleNumber(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                return nums[i];
//            }
//        }
//        return 0;
//    }
//}