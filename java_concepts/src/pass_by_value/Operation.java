package pass_by_value;

class Operation {
	int data = 50;

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
		System.out.println("change in method" + data);
	}

	public static void main(String args[]) {
		Operation op = new Operation();

		System.out.println("before change " + op.data);
		op.change(500);    // Pass-by-Value
		System.out.println("after change " + op.data);

	}
}

//There is only call by value in java, not call by reference. 
//If we call a method passing a value, it is known as call by value. 
//The changes being done in the called method, is not affected in the calling method.

//before change 50
//change in method600
//after change 50
