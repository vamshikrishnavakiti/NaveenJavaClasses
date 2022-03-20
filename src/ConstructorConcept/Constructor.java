package ConstructorConcept;

public class Constructor {
	//Construct should have the name as as class.
	// Construct is a entity to defines the functions of the class.
	public Constructor() {
		System.out.println("Default Constructor");
	}
	public Constructor(int a) {
		System.out.println("1 Param");
		System.out.println("the value of a:"+a);
	}
	public Constructor(int i, int j) {
		System.out.println("2 Param");// can we overload the constructor? Yes we can
		System.out.println("the value of i:"+i);
		System.out.println("the value of j:"+j);
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(10,20);

	}
}




