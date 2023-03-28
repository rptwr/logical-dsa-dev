package app5_data_structures_pack4;

//remove_operation

class Node2
{
	int data;
	Node2 ref;

	Node2(int data)
	{
		this.data = data;
	}
}
class LinkedList2
{
	Node2 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node2(data);
			last = first;
		}
		else
		{
			last.ref = new Node2(data);
			last = last.ref;
		}
		last.ref = first;
	}
	void read()
	{
		Node2 element = first;
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
//===================================remove==================================================================
	
	void remove(int removingValue)
	{
		Node2 element = first, prev = first;
		if(element != null)
		{
			if(element.data == removingValue)
			{
				first = first.ref;
				last.ref = first;
				return;
			}
			element = element.ref;
		}
		while (element != null && (element != first))
		{
			if(element.data ==  removingValue)
			{
				prev.ref = element.ref;
				break;
			}
			prev = element;
			element = element.ref;
		}
	}
//=====================================remove all====================================================

	void removeAll(int removingValue)
	{
		Node2 element = first, prev = first;
		if(element != null)
		{
			while(prev.data == removingValue)
			{
				first = first.ref;
				last.ref = first;
				prev = element = first;
			}
			element = element.ref;
		}
		while (element != null && (element != first))
		{
			if(element.data ==  removingValue)
			{
				prev.ref = element.ref;
				element = prev.ref;
				continue;
			}
			prev = element;
			element = element.ref;
		}
	}
}
class M4
{
	public static void main(String[] args) 
	{
		LinkedList2 list = new LinkedList2();
		list.add(40);
		list.add(40);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(55);
		list.add(40);
		list.add(15);
		list.read();
		list.remove(30);
//		list.removeAll(40);
		list.read();
	}
}






