package data_structures_dev;

class Node8
{
	int data;
	Node8 next;
	Node8 prev;
	Node8(int data)
	{
		this.data = data;
	}
}
class LinkedList8
{
	Node8 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node8(data);
			last = first;
		}
		else
		{
			last.next = new Node8(data);
			last.next.prev = last;
			last = last.next;
		}
		last.next = first; // circular in clock wise
		first.prev = last; // circular in anti clock wise
		
	}
	void read()
	{
		Node8 element = first;
		if(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}		
		while(element != null && element != first)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}

	void readInReverse()
	{
		Node8 element = last;
		if(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
		while(element != null && element != last)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
		System.out.println();
	}
}
class M22
{
	public static void main(String[] args) 
	{
		LinkedList8 list = new LinkedList8();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		//list.read();
		list.readInReverse();
	}
}






