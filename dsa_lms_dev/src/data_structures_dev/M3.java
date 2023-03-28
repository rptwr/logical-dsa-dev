package data_structures_dev;

class C
{
	int data;
	C ref;
	C(int data)
	{
		this.data = data;
	}
}
class M3
{
	public static void main(String[] args) 
	{
		C c1 = new C(10);
		C c2 = new C(5);
		C c3 = new C(50);
		C c4 = new C(20);
		c1.ref = c2;
		c2.ref = c3;
		c3.ref = c4;
		System.out.println(c1.data + ", " + c2.data + ", " + c3.data + "," + c4.data);
System.out.println(c1.data + ", " + c1.ref.data + ", " + c1.ref.ref.data + "," + c1.ref.ref.ref.data);
	}
}











