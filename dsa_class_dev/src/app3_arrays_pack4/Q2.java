package app3_arrays_pack4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//Write a program to read a file and write into a file.
public class Q2 {
	public static void main(String[] args) {
		File f1 = new File("q2.txt");
		PrintWriter pw =null;
		try {
			pw = new PrintWriter(f1);
			pw.println("hello i am nishchay pal");
			pw.println("i am from indore");
			pw.println("currently i am learning in lara");
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.flush();
		pw.close();
		FileReader fr=null;
		try {
			fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String s=br.readLine();
			while(s!=null)
			{
				System.out.println(s);
				s = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
