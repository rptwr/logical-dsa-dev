package pass_by_value;

class Operation2 {
	int data = 50;

	void change(Operation2 op) {
		op.data = op.data + 100;// changes will be in the instance variable
		System.out.println("change in method " + op.data);
	}

	public static void main(String args[]) {
		Operation2 op = new Operation2();

		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);

	}
}

//In case of call by reference original value is changed if we made changes in the called method. 
//If we pass object in place of any primitive value, original value will be changed. 
//In this example we are passing object as a value. Let's take a simple example:

//before change 50
//change in method 150
//after change 150