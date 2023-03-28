package app5_data_structures_pack1;
class Node   // node is a combination of data member i and ref to the next node
{
	int i;
	Node ref;
	Node(int i)
	{
		this.i = i;
	}
}
class LinkedList
{
	Node first;
	Node last;
	void add(int i)
	{
		Node n1 = new Node(i);
		if(first == null)
		{
			first = n1;
		}
		else
		{
			last.ref = n1;
		}
		last = n1;
	}
	void read()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.i + ", ");
			current = current.ref;
		}
	}
}
public class M7 {
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
		
		list.read();
	}
}
