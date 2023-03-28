package app5_data_structures_pack1;
class F
{
	int i;
	F ref;
	F last;
	
	F(int i)
	{
		this.i = i;
	}
	
	void add(int i)
	{
		F newNode = new F(i);
		if(last == null)
		{
			ref = newNode;
		}
		else
		{
			last.ref = newNode;
		}
		last = newNode;
	}
	
	void read()
	{
		F obj = this;
		while(obj != null)
		{
			System.out.print(obj.i + ", ");
			obj = obj.ref;
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		F f1 = new F(10);
		f1.add(20);
		f1.add(30);
		f1.add(40);
		f1.add(50);
		f1.add(60);
		f1.add(70);
		f1.add(80);
		f1.add(90);
	
		f1.read();
	}
}
