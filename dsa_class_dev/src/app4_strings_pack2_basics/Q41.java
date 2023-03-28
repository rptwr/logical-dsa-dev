 package app4_strings_pack2_basics;

//find out total length of characters in a string without using length method and length property
public class Q41 {
  public static void main(String[] args) {
      String s1 = "abc hello t";
      			// 012345678910
      System.out.println(s1);
      System.out.println((s1 + "t").lastIndexOf('t'));
      System.out.println(s1);
  }
}