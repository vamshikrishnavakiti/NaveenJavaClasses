package CoreJava;

public class CallByValueAndCallByMethod {
	int p;
	int q;
	public static void main(String[] args) {
		CallByValueAndCallByMethod obj = new CallByValueAndCallByMethod();
		int x= 30;
		int y = 40;
		int s= obj.testMethod(x, y);// Call By Value
		System.out.println(s);
         obj.p=50;
         obj.q=40;
         int t = obj.swap();
         System.out.println(t);
	}
	public int testMethod(int a, int b) {
		a =10;
		b = 20;
		int c= a+b;
		return c;
	}
	public int swap() {
		int r = p+q;
		return r;
	}

}
