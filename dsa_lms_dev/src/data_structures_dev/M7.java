package data_structures_dev;

import java.util.Scanner;

class G
{
	int data;
	G ref;
	G(int data)
	{
		this.data = data;
	}
}
class M7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		G g1 = null;
		int data;
		do
		{
			System.out.println("enter an int element");
			data = sc.nextInt();
			if(g1 == null)
			{
				g1 = new G(data);
			}
			else
			{
				G element = g1;
				while(element.ref != null)
				{
					element = element.ref;
				}
				element.ref = new G(data);
			}
			System.out.println("do you want to add one more (y / n)?");
		}while("y".equals(sc.next()));

		G element = g1;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}
