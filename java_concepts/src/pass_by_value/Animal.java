package pass_by_value;

public class Animal {
	
	int eyes;
	protected String animalName = "cow";
	
	public static void  changePrimitive(int aCopy) { 
		aCopy = 13;
		System.out.println("value of a is " + aCopy);
	}

	public static void changeObjectRefernce(Animal animalObj) { 
		animalObj.eyes = 12;
		System.out.println(animalObj.eyes);
	}
	
	public static void main(String[] args) {
		Animal animalObj = new Animal();
		animalObj.eyes = 2;
		
		int a = 3;  // local primitive
		System.out.println("value of a is " + a);
		changePrimitive(a);  // Pass by value
		System.out.println("value of a is " + a);
		
		System.out.println("-----------------------------------");
		
		System.out.println(animalObj.eyes);
		changeObjectRefernce(animalObj); // we are passing the memory address itself
		System.out.println(animalObj.eyes);
	}
}

// when the object reference passed in the particular method will make you feel its passed by refernce
// but its pass by values only its just we are passing the reference of the value. 
