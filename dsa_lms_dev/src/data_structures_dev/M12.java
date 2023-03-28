package data_structures_dev;

class Nodeee
{
	int data;
	Nodeee ref;

	Nodeee(int data)
	{
		this.data = data;
	}
}
class LinkedListtt
{
	Nodeee first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Nodeee(data);
			last = first;
		}
		else
		{
			last.ref = new Nodeee(data);
			last = last.ref;
		}
	}
	void read()
	{
		Nodeee element = first;
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
		Nodeee element = first;
		while(element != null)
		{
			size ++;
			element = element.ref;
		}
		return size;
	}
	boolean contains(int valueToSearch)
	{
		boolean status = false;
		Nodeee element = first;
		while(element != null)
		{
			if(element.data == valueToSearch)
			{
				status = true;
				break;
			}
			element = element.ref;
		}
		return status;
	}
}
class M12
{
	public static void main(String[] args) 
	{
		LinkedListtt list = new LinkedListtt();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		list.read();
		System.out.println(list.contains(40));
		System.out.println(list.contains(140));
	}
}






