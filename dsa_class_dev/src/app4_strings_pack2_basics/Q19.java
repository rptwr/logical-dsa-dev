package app4_strings_pack2_basics;

//find out vowel and number of occurance 

public class Q19 
{
	public static void main(String[] args) {
		String s1 = "Ravi Prakash Tiwariaeiou";
		String vowels = "aeiou", occurance;
		char vowel;
		int index, count;
		for(int i = 0; i < vowels.length(); i++)
		{
			occurance = "";
			count = 0;
			vowel = vowels.charAt(i);
			index = s1.indexOf(vowel);
			while(index != -1)
			{
				occurance = (occurance + index  + ", ");
				count ++;
				index = s1.indexOf(vowel, index + 1);
			}
			if(count != 0)
			{
				System.out.println(vowel + " availble in string " + count 
						+ " times " + occurance);
			}
		}
	}
}
