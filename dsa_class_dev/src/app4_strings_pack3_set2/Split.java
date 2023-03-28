package app4_strings_pack3_set2;

public class Split {
	public static void main(String[] args) {
		String s1 = "java+btm+core+advance+cpp";
		String[] result = s1.split("\\+", 0);
		
		for(String sub_string : result) {
			System.out.println(sub_string);
		}
	}
}
