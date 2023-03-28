package app5_data_structures_pack2;

class Node
{
	int i;
	Node ref;
	Node(int i)
	{
		this.i =i;
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
		last.ref = first;
	}
	void read()
	{
		Node current = first;
		if(current != null)
		{
			System.out.print(current.i + " ");
		}
		else
		{
			return;
		}
		current = current.ref;
		while(current != first)
		{
			System.out.print(current.i + " ");
			current = current.ref;
		}
		if(current != null)
		{
			System.out.print(current.i + " ");
		}
		else
		{
			return;
		}
		current = current.ref;
		while(current != first)
		{
			System.out.print(current.i + " ");
			current = current.ref;
		}
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
		list.read();
	}
}
