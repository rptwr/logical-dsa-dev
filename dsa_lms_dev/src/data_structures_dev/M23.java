package data_structures_dev;

class Node9
{
	int data;
	Node9 next;
	Node9(int data)
	{
		this.data = data;
	}
}
class LinkedList9
{
	Node9 first;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node9(data);
		}
		else
		{
			Node9 newNode = new Node9(data);
			newNode.next = first;
			first = newNode;
		}
	}
	void read()
	{
		Node9 element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}

}
class M23
{
	public static void main(String[] args) 
	{
		LinkedList9 list = new LinkedList9();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		list.read();		
	}
}






