package app5_data_structures_pack1;
class E
{
	int i;
	E ref;
	
	E(int i)
	{
		this.i = i;
	}
	
	void add(int i)
	{
		E lastNode = this;
		while(lastNode.ref != null)   // while loop keep traversing from first to last
		{
			lastNode = lastNode.ref;  // through this while loop to identify who is last element
		}
		lastNode.ref = new E(i);
	}
	
	void read()
	{
		E obj = this;
		while(obj != null)
		{
			System.out.print(obj.i + ", ");
			obj = obj.ref;
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10);
		e1.add(20);
		e1.add(30);
		e1.add(40);
		e1.add(50);
		e1.add(60);
		e1.add(70);
		e1.add(80);
		e1.add(90);
	
		e1.read();
	}
}
