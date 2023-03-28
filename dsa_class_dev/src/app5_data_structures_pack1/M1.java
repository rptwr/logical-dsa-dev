package app5_data_structures_pack1;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A(10);
		A a2 = new A(20);
		A a3 = new A(30);
		A a4 = new A(41);
		A a5 = new A(50);

		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println(a4.i);
		System.out.println(a5.i);
	}
}
// we stored 5 element in 5 different object 
//in every lets have that going to another object