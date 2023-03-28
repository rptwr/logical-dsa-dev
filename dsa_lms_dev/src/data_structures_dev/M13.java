package data_structures_dev;

class Nodeeee
{
	int data;
	Nodeeee ref;
	Nodeeee(int data)
	{
		this.data = data;
	}
}
class LinkedListttt
{
	Nodeeee first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Nodeeee(data);
			last = first;
		}
		else
		{
			last.ref = new Nodeeee(data);
			last = last.ref;
		}
	}
	void read()
	{
		Nodeeee element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
	int size()
	{
		int size = 0;
		Nodeeee element = first;
		while(element != null)
		{
			size ++;
			element = element.ref;
		}
		return size;
	}
	boolean contains(int valueToSearch)
	{
		boolean status = false;
		Nodeeee element = first;
		while(element != null)
		{
			if(element.data == valueToSearch)
			{
				status = true;
				break;
			}
			element = element.ref;
		}
		return status;
	}
	int indexOf(int valueToSearch)
	{
		int index = -1;
		Nodeeee element = first;
		boolean flag = false;
		while(element != null)
		{
			index ++;
			if(element.data == valueToSearch)
			{
				flag = true;
				break;
			}
			element = element.ref;
		}
		return flag ? index : -1;
	}
}
class M13
{
	public static void main(String[] args) 
	{
		LinkedListttt list = new LinkedListttt();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		System.out.println(list.indexOf(40));
		System.out.println(list.indexOf(140));
	}
}






