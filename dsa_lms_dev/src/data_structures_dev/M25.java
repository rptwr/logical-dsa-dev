package data_structures_dev;

class Node22
{
	int data;
	Node22 next;
	Node22(int data)
	{
		this.data = data;
	}
}
class Queue
{
	Node22 first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node22(data);
			last = first;
		}
		else
		{
			last.next = new Node22(data);
			last = last.next;
		}
	}
	void read()
	{

		Node22 element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}
	int readFirst()
	{
		if(first == null)
		{
			//raise an exception
		}
		return first.data;
	}
	void removeFirst()
	{
		if(first == null)
		{
			return;
		}
		if(first.next == null)
		{
			first = last = null;
			return;
		}
		first = first.next;
	}
}
class M25
{
	public static void main(String[] args) 
	{
		Queue queue = new Queue();
		queue.add(10);
		queue.add(20);
		queue.add(40);
		queue.add(25);
		queue.add(39);
		queue.read();		
		queue.removeFirst();
		queue.read();
		queue.removeFirst();
		queue.read();
		queue.removeFirst();
		queue.read();
		queue.removeFirst();
		queue.read();
		queue.removeFirst();
		queue.read();
		queue.removeFirst();
		queue.read();
	}
}






