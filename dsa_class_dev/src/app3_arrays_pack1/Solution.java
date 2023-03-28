package app3_arrays_pack1;
import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
	{
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++)
		{
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int value = a;
            for(int j = 0; j < (n); j++)
            {
                value += (int) Math.pow(2, j) * b;
                System.out.print(value + " ");
            } 
            System.out.println();
        }
        in.close();
    }
}