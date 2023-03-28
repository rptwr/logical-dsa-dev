package java_string;

public class JavaStringPool {
	 
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hi");
        String s4 = "Hi";
 
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s3 == s4? " + (s3 == s4));
 
        s3 = s3.intern();
        System.out.println("s3 == s4? " + (s3 == s4));
 
    }
 
}



//s1 == s2? true
//s3 == s4? false
//s3 == s4? true


////Swap Two Strings in Java using Third Variable
//
//public class M1 {
//	 
// public static void main(String[] args) {
//     String s1 = "Apple";
//     String s2 = "Banana";
//
//     System.out.printf("Before Swapping s1 = %s and s2 = %s.\n", s1, s2);
//
//     String temp = s1;
//     s1 = s2;
//     s2 = temp;
//
//     System.out.printf("After Swapping s1 = %s and s2 = %s.\n", s1, s2);
// }
//}




//
////Swap Two Strings in Java without Third Variable
////The idea is to use String concatenation and then substring() method to swap two strings without using any third variable.
//
//public class M2 {
//	 
// public static void main(String[] args) {
//     String s1 = "Apple";
//     String s2 = "Banana";
//
//     System.out.println(String.format("Before Swapping s1 = %s and s2 = %s.\n", s1, s2));
//
//     s1 = s1 + s2; // s1 = "AppleBanana";
//     s2 = s1.substring(0, s1.length()-s2.length()); // s2 = "AppleBanana".substring(0, 11-6) = "Apple"
//     s1 = s1.substring(s2.length()); // s1 = "AppleBanana".substring(5) = "Banana"
//
//     System.out.println(String.format("After Swapping s1 = %s and s2 = %s.\n", s1, s2));
// }
//}