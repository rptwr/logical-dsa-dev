package app1_string;

import java.util.HashMap;
import java.util.Scanner;

public class M4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("supply a string");
		String s1 = sc.nextLine();
		String vovels = "AEIOU";
		s1 = s1.toUpperCase(); 
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (vovels.indexOf(s1.charAt(i)) != -1) {
				if (map.containsKey(s1.charAt(i))) {
					map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
				} else
					map.put(s1.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

}
