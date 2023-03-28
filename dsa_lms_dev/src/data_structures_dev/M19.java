package data_structures_dev;

class Node5
{
	int data;
	Node5 ref;

	Node5(int data)
	{
		this.data = data;
	}
}
class LinkedList5
{
	Node5 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node5(data);
			last = first;
		}
		else
		{
			last.ref = new Node5(data);
			last = last.ref;
		}
		last.ref = first;
	}
	void read()
	{
		Node5 element = first;
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
	void remove(int removingValue)
	{
		Node5 element = first, prev = first;
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
	void removeAll(int removingValue)
	{
		Node5 element = first, prev = first;
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
class M19
{
	public static void main(String[] args) 
	{
		LinkedList5 list = new LinkedList5();
		list.add(40);
		list.add(40);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(55);
		list.add(40);
		list.add(15);
		list.read();
		//list.remove(30);
		list.removeAll(40);
		list.read();
	}
}






