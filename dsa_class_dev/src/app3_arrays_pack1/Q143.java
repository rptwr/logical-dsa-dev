package app3_arrays_pack1;

/*
Write a program to check if elements of an array are same or 
not while reading from front or back
{10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10}

*/
import java.util.Arrays;
class Q143
{
   public static void main(String[] args) 
   {
       int [] a = {10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10};

       
       boolean b = false;
       for (int i= 0;i<a.length/2;i++)
       {
           if (a[i] == a[a.length-1-i])
           {
               b = true;
               continue;
           }
           else 
           {
               b = false;
               System.out.println("No array not same ");
           }
       }
       if (b)
       {
            System.out.println("Yes elements of array are same");
       }
   }
}

