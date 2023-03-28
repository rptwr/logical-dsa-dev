package app5_data_structures_pack3;

class Node
{
	Object data;  // if attribute is object type then we can store any type
	Node prev;
	Node next;
	Node(Object data)
	{
		this.data = data;
	}
}
class LinkedList
{
	Node first, last;

	void add( Object data)
	{
		Node n1 = new Node(data);
		if(first == null)
		{
			first = n1;
		}
		else
		{
			last.next = n1;
		}
		n1.prev = last;
		last = n1;
		
	}
	void readInClockWise()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	void readInAntiClockWise()
	{
		Node current = last;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println();
	}
}
public class M1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(140);
		list.readInClockWise();
		list.readInAntiClockWise();
	}

}

