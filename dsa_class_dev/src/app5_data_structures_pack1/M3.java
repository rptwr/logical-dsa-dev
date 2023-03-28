package app5_data_structures_pack1;
class C
{
	int i;
	C ref;
	C(int i)
	{
		this.i = i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(10);
		c1.ref = new C(20);
		c1.ref.ref = new C(30);
		c1.ref.ref.ref = new C(40);
		c1.ref.ref.ref.ref = new C(50);
		
//		System.out.println(c1.i);
//		System.out.println(c1.ref.i);
//		System.out.println(c1.ref.ref.i);
//		System.out.println(c1.ref.ref.ref.i);
//		System.out.println(c1.ref.ref.ref.ref.i);
		
		
	}
}
