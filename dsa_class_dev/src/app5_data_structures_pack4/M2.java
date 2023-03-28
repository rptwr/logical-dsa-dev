package app5_data_structures_pack4;
// circular_linked_list

class Nodee
{
	int data;
	Nodee ref;
	Nodee(int data)
	{
		this.data = data;
	}
}

class LinkedListt
{
	Nodee first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Nodee(data);
			last = first;
		}
		else
		{
			last.ref = new Nodee(data);
			last = last.ref;
		}
		last.ref = first;   // circular linked list
	}
//===================infinite loop/ circular linked list===========================================
//	void read()
//	{
//		Nodee element = first;
//		while(element != null)
//		{
//			System.out.print(element.data + ", ");
//			element = element.ref;
//		}
//	}
//=====================circular singular linked list===============================================
	void read()
	{
		Nodee element = first;
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
	}
//====================================================================================================

	int size()
	{
		Nodee element = first;
		int size = 0;
		while(element != null)
		{
			size ++;
			element = element.ref;
		}
		return size;
	}
}

class M2 {
	public static void main(String[] args) {
		LinkedListt list = new LinkedListt();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.read();
//		System.out.println(list.size());
	}
}


































//class Node
//{
//	int data;
//	Node ref;
//	Node(int data)
//	{
//		this.data = data;
//	}
//}
//
//class LinkedList
//{
//	Node first, last;
//	void add(int data)  // through add() we are making circular linked list
//	{
//		if(first == null)
//		{
//			first = new Node(data);
//			last = first;
//		}
//		else
//		{
//			last.ref = new Node(data);
//			last = last.ref;
//		}
//		last.ref = first;   // for circular linked list
//	}
////===================== circular linked list infinite loop output============================================================
////	void read()
////	{
////		Node element = first;
////		while(element != null)
////		{
////			System.out.print(element.data + ", ");
////			element = element.ref;
////		}
////	}
////===================================================================================================
//	void read()
//	{
//		Node element = first;
//		if(element != null)
//		{
//			System.out.print(element.data + ", ");
//			element = element.ref;
//		}
//		while(element != first)
//		{
//			System.out.print(element.data + ", ");
//			element = element.ref;
//		}
//	}
//}
//
//public class M1 {
//	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		list.read();
//	}
//}
