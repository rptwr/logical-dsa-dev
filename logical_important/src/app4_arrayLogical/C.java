package app4_arrayLogical;

import java.util.HashMap;
import java.util.Iterator;

public class C {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}
		System.out.println(map);
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null && map.get(nums[i]) < 2) {
				sum += nums[i];
			}
		}
		System.out.println(sum);
	}
}
