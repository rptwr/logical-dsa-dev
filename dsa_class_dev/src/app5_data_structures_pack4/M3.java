package app5_data_structures_pack4;

// circular_singular_linkedlist
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
		
		while(element != null && (element != first))
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
//=================replacing one element with another=================================================

	void replaceFromToTo(int from, int to)
	{
		Node1 element = first;
		if(element != null)
		{
			if(element.data == from)
			{
				element.data = to;
				return;
			}
			element = element.ref;  // if from is not available in first node move to second node
		}
		while (element != null && (element != first))  // second node onwards
		{
			if(element.data == from)
			{
				element.data = to;
//				break;
				continue;
			}
			element = element.ref;
		}
	}
}
class M3
{
	public static void main(String[] args) 
	{
		LinkedList1 list = new LinkedList1();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		list.add(30);
		list.add(25);
		list.add(15);
		list.add(45);
		list.read();
		list.replaceFromToTo(25, 100);
		list.read();
	}
}






