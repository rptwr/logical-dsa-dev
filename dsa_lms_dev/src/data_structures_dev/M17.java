package data_structures_dev;

class Node3
{
	int data;
	Node3 ref;

	Node3(int data)
	{
		this.data = data;
	}
}
class LinkedList3
{
	Node3 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node3(data);
			last = first;
		}
		else
		{
			last.ref = new Node3(data);
			last = last.ref;
		}
		last.ref = first;
	}
	void read()
	{
		Node3 element = first;
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
	int leftTo(int valueToSearch)
	{
		Node3 element = first, prev = first;
		if(element != null)
		{
			if(element.data == valueToSearch)
			{
				//throw an exception
				//or
				return last.data;
			}
			element = element.ref;
		}
		while(element != null && (element != first))
		{
			if(element.data == valueToSearch)
			{
				break;
			}
			prev = element;
			element = element.ref;
		}
		return prev.data;
	}

	void printleftAndRight(int valueToSearch)
	{
		Node3 element = first, prev = first;
		if(element != null)
		{
			if(element.data == valueToSearch || last.data == valueToSearch)
			{
				//throw an exception
				//or
				System.out.println(last.data + ", " + element.ref.data);
			}
			element = element.ref;
		}
		while(element != null && (element != first))
		{
			if(element.data == valueToSearch)
			{
				System.out.println(prev.data + ", " + element.ref.data);
				break;
			}
			prev = element;
			element = element.ref;
		}
	}
}
class M17
{
	public static void main(String[] args) 
	{
		LinkedList3 list = new LinkedList3();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		list.add(30);
		list.add(15);
		list.add(45);
		list.read();
		list.printleftAndRight(39);   //25, 30
		list.printleftAndRight(40);   //20, 25
		list.printleftAndRight(10);   //some exception  (or)      45, 20
		list.printleftAndRight(25);   //40, 39
	}
}






