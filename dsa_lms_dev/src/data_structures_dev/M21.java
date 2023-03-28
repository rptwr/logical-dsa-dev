package data_structures_dev;

class Node7
{
	int data;
	Node7 next;
	Node7 prev;
	Node7(int data)
	{
		this.data = data;
	}
}
class LinkedList7
{
	Node7 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node7(data);
			last = first;
		}
		else
		{
			last.next = new Node7(data);
			last.next.prev = last;
			last = last.next;
		}
		last.next = first; // circular in clock wise
		first.prev = last; // circular in anti clock wise
		
	}
	void read()
	{
		Node7 element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}

	void readInReverse()
	{
		Node7 element = last;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
		System.out.println();
	}
}
class M21
{
	public static void main(String[] args) 
	{
		LinkedList7 list = new LinkedList7();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		//list.read();
		list.readInReverse();
	}
}






