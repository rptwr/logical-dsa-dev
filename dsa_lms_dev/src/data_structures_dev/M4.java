package data_structures_dev;

class D
{
	int data;
	D ref;
	D(int data)
	{
		this.data = data;
	}
}
class M4
{
	public static void main(String[] args) 
	{
		D d1 = new D(10);
		d1.ref = new D(5);
		d1.ref.ref = new D(50);
		d1.ref.ref.ref = new D(20);
		System.out.println(d1.data + ", " + d1.ref.data + ", " + d1.ref.ref.data + "," + d1.ref.ref.ref.data);
	}
}
