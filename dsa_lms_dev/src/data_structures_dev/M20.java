package data_structures_dev;

class Node6
{
	int data;
	Node6 next;
	Node6 prev;
	Node6(int data)
	{
		this.data = data;
	}
}
class LinkedList6
{
	Node6 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node6(data);
			last = first;
		}
		else
		{
			last.next = new Node6(data);
			last.next.prev = last;
			last = last.next;
		}
	}
	void read()
	{
		Node6 element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}
	void readInReverse()
	{
		Node6 element = last;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
		System.out.println();
	}
}

class M20
{
	public static void main(String[] args) 
	{
		LinkedList6 list = new LinkedList6();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		//list.read();
		list.readInReverse();
	}
}






