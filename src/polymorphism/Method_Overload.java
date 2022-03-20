package polymorphism;

public class Method_Overload {
  void Employee(int a) {
	  System.out.println("This is Emplyee1");
  }
  void Employee(String name) {
	  System.out.println("This is Employee2");
  }
	
	
	public static void main(String[] args) {
		Method_Overload m = new Method_Overload();
		m.Employee(10);
	}

}
/*
 * // The connditions for acheiving Method Overlooading //1) To acheive method
 * names should be same. //2) To achieve number of aurguments, Type of
 * aurguments, Sequence of aurguments should not be same. //3) To acheive class
 * name be same. // interview Q) Can we achieve Method overloading by changing
 * the retrun type of Method only? // Ans: NO, we cannot achieve. because of
 * ambiguity. // Q) Can we overload Main method?- Yes we can because JVM call
 * Main() method which receives String array as aurguments.
 */