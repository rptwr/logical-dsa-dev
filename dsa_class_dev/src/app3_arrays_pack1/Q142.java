package app3_arrays_pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/*

Read the content from a file and take word by word and store in the array.
1. Find out total number of words.
2. Find out total number of words which are with a single character
3. Print all single char words
4. Print the largest word/words
5. Print most repeated word and its number of times
6. Print the least repeated word and its number of times?
7. Print all palidroms ??
8. Print all the words which are containing any one digit anywhere
9. Print the word which first repated?
10. Print the word which is first non repeated?

 */
public class Q142 {
	public static void main(String[] args) throws IOException{
		String[] words  = new String[0], temp1, temp2;
		FileReader fin = new FileReader("test.txt");
		BufferedReader bin = new BufferedReader(fin);
		String line = bin.readLine();
		while(line != null)
		{
			temp1 = line.split(" ");
			temp2 = words;
			words = new String[temp1.length + temp2.length];
			for(int i = 0; i < temp2.length; i++)
			{
				words[i] = temp2[i];
			}
			for(int i = 0; i < temp1.length; i++)
			{
				words[temp2.length + i] = temp1[i];
			}
			//System.out.println(words.length);
			line  = bin.readLine();
		}
		//1. Find out total number of words.
		System.out.println("total number of words:" + words.length);
		//2. Find out total number of words which are with a single character
		int count = 0;
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].length() == 1)
			{
				count++;
			}
		}
		System.out.println("single char words count:" + count);
		//3. Print all single char words
		System.out.println("all single charwords:");
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].length() == 1)
			{
				System.out.print(words[i] + ", ");
			}
		}
		System.out.println();
		//4. Print the largest word/words
		String largestWord = words[0];
		for(int i = 1; i < words.length; i++)
		{
			if(words[i].length() > largestWord.length())
			{
				largestWord =  words[i];
			}
		}
		System.out.println("Largest word:" + largestWord);
		/*
		//5. Print most repeated word and its number of times
		HashMap<String, Integer> map = new HashMap<>();
		String word;
		for(int i  = 0; i < words.length; i++)
		{
			word = words[i];
			if(map.get(word) ==  null)
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
		for(String w1 : map.keySet())
		{
			if(map.get(w1) > count)
			{
				count = map.get(w1);
				word = w1;
			}
		}
		//System.out.println(map);
		System.out.println("most repeated word and its number of times:" + word + " and " + count + "times");
	
		//6. Print the least repeated word and its number of times?
	
		count = Integer.MAX_VALUE;
		word = null;
		for(String w1 : map.keySet())
		{
			if(map.get(w1) < count)
			{
				count = map.get(w1);
				word = w1;
			}
		}
		
		System.out.println("least repeated word and its number of times:" + word + " and " + count + "times");
		*/

		//5. Print most repeated word and its number of times
		String wordsOccurances = "";
		String word, occurances;
		int wordIndex, toIndex;
		count = 0;
		for(int i = 0; i< words.length; i++)
		{
			word = words[i];
			wordIndex = wordsOccurances.indexOf(word);
			if(wordIndex == -1)
			{
				wordsOccurances +=  word + "=" + 1 + "&";
			}
			else
			{
				toIndex = wordsOccurances.indexOf('&', wordIndex);
				if(toIndex == -1)
				{
					toIndex = wordsOccurances.length();
				}
				occurances = wordsOccurances.substring(wordIndex + word.length() + 1, toIndex);
				count = Integer.parseInt(occurances);
				count ++;
				wordsOccurances = wordsOccurances.substring(0, wordIndex + word.length() + 1) + count + wordsOccurances.substring(toIndex);
				
			}
		}
		String[] wordsOccurancesSpilt = wordsOccurances.split("&");
		count = 0;
		int maxOccurance = 0, minOccurances = Integer.MAX_VALUE;
		String maxOccuranceWord = null, minOccuranceWord = null;;
		
		for(String str : wordsOccurancesSpilt)
		{
			word = str.substring(0, str.indexOf('='));
			count = Integer.parseInt(str.substring(str.indexOf('=') + 1).trim());
			if(maxOccurance < count)
			{
				maxOccurance = count;
				maxOccuranceWord = word;
			}
			if(minOccurances > count)
			{
				minOccurances = count;
				minOccuranceWord = word;
			}
		}
		System.out.println("most repeated word:" + maxOccuranceWord + " and occuring " + maxOccurance + " times");
		System.out.println("least repeated word:" + minOccuranceWord + " and occuring " + minOccurances + " times");

		
		
		//	7. Print all palidroms ??
		for(int i = 0; i < words.length; i++)
		{
			word = words[i];
			if(word.length() > 1 && word.equals(reverse(word)))
			{
				System.out.println(word + " is a palindrome");
			}
		}
		//8. Print all the words which are containing any one digit anywhere
		String digits = "0123456789";
		System.out.println("words with a digit:");
		for(int i = 0; i < words.length; i++)
		{
			word = words[i];
			for(int j = 0; j < word.length(); j++)
			{
				if(digits.indexOf(word.charAt(j)) != -1)
				{
					System.out.print(word + ", ");
					break;
				}
			}
		}
		System.out.println();

		//9. Print the word which first repated?
		loop1:
		for(int i = 0; i < words.length; i++)
		{
			word = words[i];
			for(int j = i + 1; j < words.length; j++)
			{
				if(word.equals(words[j]))
				{
					System.out.println("first repeated word:" + word);
					break loop1;
				}
			}
		}

		//10. Print the word which is first non repeated?
		boolean isRepated = false;
		for(int i = 0; i < words.length; i++)
		{
			word = words[i];
			for(int j = i + 1; j < words.length; j++)
			{
				if(word.equals(words[j]))
				{
					isRepated = true;
					break;
				}
			}
			if(!isRepated)
			{
				System.out.println("first non repeated word:" + word);
				break;
			}
			isRepated = false;
		}	
	}
	static String reverse(String s1)
	{
		if(s1.length() == 1)
		{
			return s1;
		}
		return s1.charAt(s1.length() - 1) + reverse(s1.substring(0, s1.length() - 1));
	}


}