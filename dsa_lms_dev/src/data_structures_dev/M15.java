package data_structures_dev;

class Node1
{
	int data;
	Node1 ref;

	Node1(int data)
	{
		this.data = data;
	}
}
class LinkedList1
{
	Node1 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node1(data);
			last = first;
		}
		else
		{
			last.ref = new Node1(data);
			last = last.ref;
		}
		last.ref = first;
	}
	void read()
	{
		Node1 element = first;
		if(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}		
		while(element != first)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
}
class M15
{
	public static void main(String[] args) 
	{
		LinkedList1 list = new LinkedList1();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		list.read();
	}
}






