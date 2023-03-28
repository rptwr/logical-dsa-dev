package data_structures_dev;

class E
{
	int data;
	E ref;
	E(int data)
	{
		this.data = data;
	}
}
class M5
{
	public static void main(String[] args) 
	{
		E e1 = new E(10);
		e1.ref = new E(5);
		e1.ref.ref = new E(50);
		e1.ref.ref.ref = new E(20);
		e1.ref.ref.ref.ref = new E(210);
		e1.ref.ref.ref.ref.ref = new E(120);
		e1.ref.ref.ref.ref.ref.ref = new E(201);
		e1.ref.ref.ref.ref.ref.ref.ref = new E(201);
		E element = e1;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}



