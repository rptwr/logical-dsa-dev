package app5_data_structures_pack1;
class D
{
	int i;
	D ref;
	D(int i)
	{
		this.i = i;
	}
	void read()
	{
		D obj = this;   
		while(obj != null)
		{
			System.out.print(obj.i + ", ");
			obj = obj.ref;
		}
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10);
		d1.ref = new D(20);
		d1.ref.ref = new D(30);
		d1.ref.ref.ref = new D(40);
		d1.ref.ref.ref.ref = new D(50);
		d1.ref.ref.ref.ref.ref = new D(60);
		
		d1.read();
	}
}

// current object ref 
//D obj = this;   
//while(obj != null)
//{
//	System.out.print(obj.i + ", ");
//	obj = obj.ref;
//}