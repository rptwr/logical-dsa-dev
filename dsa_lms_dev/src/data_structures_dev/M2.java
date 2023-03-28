package data_structures_dev;

class B
{
	int data;
	B(int data)
	{
		this.data = data;
	}
}
class M2
{
	public static void main(String[] args) 
	{
		B b1 = new B(10);
		B b2 = new B(5);
		B b3 = new B(50);
		B b4 = new B(20);
		System.out.println(b1.data + ", " + b2.data + ", " + b3.data + "," + b4.data);
	}
}
