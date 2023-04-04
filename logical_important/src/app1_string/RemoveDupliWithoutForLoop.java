package app1_string;

public class RemoveDupliWithoutForLoop {

	public static void main(String[] args) {
		  String str = "appnnacollege";
		  String newstr = "";
		  // 			apncoleg
		  String s = removeduplicate(str, 0, newstr , new boolean[26]);
		  System.out.println(s);
			
			
		}
		static String removeduplicate(String str, int index, String newstr, boolean [] map)
		{
			if(index == str.length()-1)
			{
			//	System.out.println(newstr);
				return newstr;
			}
			char ch = str.charAt(index);
			if(map[ch - 'a'] == true)
			{
				return removeduplicate(str, index+1, newstr, map);
			}
			else
			{
				map[ch - 'a'] = true;
				return removeduplicate(str, index+1, newstr += ch, map);
			}
		}
}