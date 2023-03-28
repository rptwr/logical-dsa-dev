package app3_arrays_pack4;
//How to read all the files even the files in subfolders recursively from a particular directory
import java.io.File;
public class Q10 {
	public static void main(String[] args) {
		File f1 = new File("C:/Users/HP/Desktop");
		String []s = f1.list();
		for(String s2 : s)
		{
			System.out.println(s2);
		}
	}
}
