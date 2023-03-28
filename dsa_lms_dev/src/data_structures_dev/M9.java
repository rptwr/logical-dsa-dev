package data_structures_dev;

class I
{
	int data;
	I ref;
	I last;
	I(int data)
	{
		this.data = data;
	}
	void add(int data)
	{
		if(ref == null)
		{
			ref = new I(data);
			last = ref;
		}
		else
		{
			last.ref = new I(data);
			last = last.ref;
		}
	}
	void read()
	{
		I element = this;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}
class M9
{
	public static void main(String[] args) 
	{
		I i1 = new I(90);
		i1.add(10);
		i1.add(20);
		i1.add(40);
		i1.add(35);
		i1.add(60);
		i1.read();
	}
}






