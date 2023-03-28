package app5_data_structures_pack1;
class B
{
	int i;
	B ref;
	B(int i)
	{
		this.i = i;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(20);
		B b3 = new B(30);
		B b4 = new B(40);
		B b5 = new B(50);
		b1.ref = b2;  // through this assignment we are maintaining structure
		b2.ref = b3;
		b3.ref = b4;
		b4.ref = b5;
		
		System.out.println(b1.i);
		System.out.println(b2.i);
		System.out.println(b3.i);
		System.out.println(b4.i);
		System.out.println(b5.i);
		System.out.println(b1.ref.i);
		System.out.println(b1.ref.ref.i);
		System.out.println(b1.ref.ref.ref.i);
		System.out.println(b1.ref.ref.ref.ref.i);
//		System.out.println(b1.ref.ref.ref.ref.ref.i);   //  java.lang.NullPointerException: 
	}
}

