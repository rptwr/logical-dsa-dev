package app3_arrays_pack2_imp;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class E {
	public static void main(String[] args) throws IOException {
		String[] words = new String[0], temp1, temp2;
		FileReader fin = new FileReader("test.txt");
		BufferedReader bin = new BufferedReader(fin);
		String line = bin.readLine();
		while (line != null)
		{
			temp1 = line.split(" ");
			temp2 = words;
			words = new String[temp1.length + temp2.length];
			for (int i = 0; i < temp2.length; i++)
			{
				words[i] = temp2[i];
			}
			for (int i = 0; i < temp1.length; i++)
			{
				words[temp2.length + i] = temp1[i];
			}
			//System.out.println(words.length);
			line = bin.readLine();
		}
		//1. Find out total number of words.
		System.out.println("total words: " + words.length);
		
		//2. Find out total number of words which are with a single character
		int count = 0;
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].length() == 1)
			{
				count++;
			}
		}
		System.out.println("Single char words count: " + count);
		
		//3. Print all single char words
		System.out.println("all Single charwords: ");
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].length() == 1)
			{
				System.out.print(words[i] + ", ");
			}
		}
		System.out.println();
		
		//4. Print the largest word/words
		String largestWord = words[0];
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].length() > largestWord.length())
			{
				largestWord = words[i];
			}
		}
		System.out.println("Largest word: " + largestWord);

		//5. Print most repeated word and its number of times
		HashMap<String, Integer> map = new HashMap<>();
		String word;
		for (int i = 0; i < words.length; i++)
		{
			word = words[i];
			if (map.get(word) == null)
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, map.get(word) + 1);
			}
		}
		System.out.println(map);
		count = 0;
		word = null;
		for (String w1 : map.keySet())
		{
			if (map.get(w1) > count)
			{
				count = map.get(w1);
				word = w1;
			}
		}
		System.out.println("most repeated word and its number of times: " + word + " and " + count + " times");
		fin.close();
	}
}