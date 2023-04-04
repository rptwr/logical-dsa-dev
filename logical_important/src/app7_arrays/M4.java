package app7_arrays;

public class M4 {
	public static void main(String[] args) {
		String s = "textbook";
		String vov = "aeiouAEIOU";
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        int counta = 0;
        int countb = 0;
        for(int i = 0 ; i < a.length() ; i++)
        {
            if(vov.indexOf(a.charAt(i)) != -1)
            {
                counta++;
            }
            
        }
        for(int i = 0 ; i < b.length() ; i++)
        {
            if(vov.indexOf(b.charAt(i)) != -1)
            {
                countb++;
            }
        }
        System.out.println(counta +" " + countb);
        System.out.println( counta == countb);
	}
}
