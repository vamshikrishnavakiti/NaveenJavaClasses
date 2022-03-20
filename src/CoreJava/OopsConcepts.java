package CoreJava;

public class OopsConcepts {
	
	
	public static void main(String[] args) {
		OopsConcepts obj = new OopsConcepts();
	 int  i=   obj.add();
	 System.out.println(i);
	 obj.m2();
	 int d = obj.div(30, 3);
	 System.out.println(d);
	 obj.m3();
	}
	public int add() {
		System.out.println("addition method");
		int a =10;
		int b = 20;
		int c= a+b;
		
		return c;
	}
	public void m2() {
		System.out.println("method 2");}
	
public int div(int x, int y) {
	System.out.println("Division Method");
	int d =x/y;
	return d;
}
  static void m3() {
	 System.out.println("m3 method");
 }
	}

