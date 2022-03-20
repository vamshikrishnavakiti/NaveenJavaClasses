package CoreJava;
// The scope of the global variable will available across the Functions
public class StaticAndNonStatic {
	String name = "Vamshi";
	static int age = 30;

	public static void main(String[] args) {

		System.out.println(age);
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.m1();
	Object m2;
	int	r = m2(10,2);
	System.out.println(r);
		
//		StaticAndNonStatic.m2(10,3);
		System.out.println(obj.name);
	}
	int m1() {
		int a =10;
		int b=20;
		int c= a+b;
		return c;
	}
	static int m2(int a, int b) {
		System.out.println("Static Method");
		int r= a/b;
		return r;
	}
}