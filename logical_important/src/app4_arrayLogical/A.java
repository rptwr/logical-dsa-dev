package app4_arrayLogical;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class A {
	public static void main(String[] args) {
		String[] w1 = { "leetcode", "is", "amazing", "as", "is" };
		String[] w2 = { "amazing", "leetcode", "is" };
		int count = 0;
		HashMap<String, Integer> m1 = new HashMap();
		HashMap<String, Integer> m2 = new HashMap();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < w1.length; i++) {
			if (m1.containsKey(w1[i])) {
				m1.put(w1[i], m1.get(w1[i]) + 1);
			} else
				m1.put(w1[i], 1);
		}
		for (int i = 0; i < w2.length; i++) {
			if (m2.containsKey(w2[i])) {
				m2.put(w2[i], m2.get(w2[i]) + 1);
			} else
				m2.put(w2[i], 1);
		}
		for (int i = 0; i < w1.length; i++) {
			if (m1.get(w1[i]) != null && m2.containsKey(w1[i])) {
				if (m1.get(w1[i]) == 1 && m2.get(w1[i]) == 1) {
					count++;
				}
			}
		}
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(count);
	}
}