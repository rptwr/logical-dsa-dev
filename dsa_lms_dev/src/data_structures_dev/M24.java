package data_structures_dev;

class Node11
{
	int data;
	Node11 next;
	Node11(int data)
	{
		this.data = data;
	}
}
class Stack
{
	Node11 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node11(data);
			last = first;
		}
		else
		{
			last.next = new Node11(data);
			last = last.next;
		}
	}
	void read()
	{

		Node11 element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}
	int readLast()
	{
		return last.data;
	}
	void removeLast()
	{
		if(first == null)
		{
			return;
		}
		Node11 element = first;
		if(element.next == null)
		{
			first = last = null;
			return;
		}
		while(element.next != last)
		{
			element = element.next;
		}
		element.next = null;
		last = element;
	}
}
class M24
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		stack.add(10);
		stack.add(20);
		stack.add(40);
		stack.add(25);
		stack.add(39);
		stack.read();		
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
	}
}






