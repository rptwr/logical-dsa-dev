package app4_strings_pack1;

import java.util.Scanner;

public class Q35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line of cahr");
		String line=sc.nextLine();
		int fromIndex =0, toIndex = getToIndex(line,0);
		String word;
				while(toIndex !=-1)
				{
					word=line.substring(fromIndex, toIndex);
					System.out.println(word);
					toIndex= nextSeparators(line,toIndex);
					fromIndex=toIndex+1;
					toIndex=getToIndex(line,fromIndex);
				}
			word =line.substring(fromIndex);
			System.out.println(word);
	}
	static int getToIndex(String line,int toIndex)
	{
		boolean isAvailable=false;
		for(int i=toIndex;i<line.length();i++)
		{
			if(" ,;".indexOf(line.charAt(i))!=-1)
			{
				toIndex=i;	
				isAvailable=true;
				break;
			}
		}
		if(!isAvailable)
		{
			toIndex=-1;
		}
		return toIndex;
	}
	static int nextSeparators(String line,int toindex)
	{
		
			while(" ,;".indexOf(line.charAt(toindex+1))!=-1)
			{
				toindex++;
			}
	return toindex;
	}

	static int checkSpace(int toIndex,String line)
	{
		while(line.charAt(toIndex+1)==' ' ||line.charAt(toIndex+1)==','||line.charAt(toIndex+1)==';')
		{
			toIndex++;
		}
		return toIndex;
	}

	}

//abc  xyz ;  hello, ; , ; test ; , 123,,,yek;;;;,,,,233 1212,212
//abc
//xyz
//hello
//test
//123
//yek
//233