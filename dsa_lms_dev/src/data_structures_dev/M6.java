package data_structures_dev;
class F
{
	int data;
	F ref;
	F(int data)
	{
		this.data = data;
	}
}
class M6
{
	public static void main(String[] args) 
	{
		F f1 = null;
		//10 20 5 50 
		for(String s1 : args)
		{
			if(f1 == null)
			{
				f1 = new F(Integer.parseInt(s1));
			}
			else
			{
				F element = f1;
				while(element.ref != null)
				{
					element = element.ref;
				}
				element.ref = new F(Integer.parseInt(s1));
			}
		}
		F element = f1;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}


