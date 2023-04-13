package strings_with_file_handling_dev;

import java.io.File;
import java.util.Scanner;

public class D {
	public static void main(String[] args) throws Exception{
		System.out.println("enter path");
		String s1 = new Scanner(System.in).next();
		File file = new File(s1);
		File[] files = file.listFiles();
		for(File f1 : files) {
			System.out.println(f1.getName());
		}
	}
}

// listFiles() returns all the file in given directory

//enter path
//
//E:\core-java-dev\file_docs
//hello.html
//spacex.png
//teslalogo.png
//Test.java