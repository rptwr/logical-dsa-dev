package app3_arrays_pack1;

/*
Find a triplet that sum to a given value
*/

class Q152
{
   public static void main(String[] args) 
   {
       int[] a = {5,10,15,20,30,40,50,60,70};

       if (args.length<1)
       {
           System.out.println("Enter a Number: ");
           return;
       }
       int n = Integer.parseInt(args[0]);
       for (int i=0;i<a.length;i++)
       {
         for (int j=i+1;j<a.length;j++)
         {
             for (int k=j+1;k<a.length;k++ )
             {
                 if (a[i] + a[j] +a[k] == n)
                 {
                     System.out.println(a[i] + "," + a[j] +"," + a[k]);
                 }
             }
         }
          
       }
   }
}