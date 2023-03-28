package data_structures_dev;

class Nodee
{
	int data;
	Nodee ref;
	Nodee(int data)
	{
		this.data = data;
	}
}
class LinkedListt
{
	Nodee first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Nodee(data);
			last = first;
		}
		else
		{
			last.ref = new Nodee(data);
			last = last.ref;
		}
	}
	void read()
	{
		Nodee element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
	int size()
	{
		int size = 0;
		Nodee element = first;
		while(element != null)
		{
			size ++;
			element = element.ref;
		}
		return size;
	}
}
class M11
{
	public static void main(String[] args) 
	{
		LinkedListt list = new LinkedListt();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		list.read();
		System.out.println(list.size());
	}
}






