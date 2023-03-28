package data_structures_dev;

class Nodeeeee
{
	int data;
	Nodeeeee ref;

	Nodeeeee(int data)
	{
		this.data = data;
	}
}
class LinkedListtttt
{
	Nodeeeee first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Nodeeeee(data);
			last = first;
		}
		else
		{
			last.ref = new Nodeeeee(data);
			last = last.ref;
		}
		last.ref = first;
	}
	void read()
	{
		Nodeeeee element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
}
class M14
{
	public static void main(String[] args) 
	{
		LinkedListtttt list = new LinkedListtttt();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		list.read();
	}
}






