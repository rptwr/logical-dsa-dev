package app3_arrays_pack4;

public class Q9 {
	public static void main(String[] args) {
		String s = "jajajadghdmkd";
		char c[] = s.toCharArray();
		for(int i =0 ;i<c.length;i++)
		{
			boolean flag = false;
			if(c[i] == '\u0000')
			{
				continue;
			}
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					c[j] = '\u0000';
					flag = true;
				}
			}
			if(flag)
			{	
				System.out.println(c[i]);
			}
		}
	}
}
