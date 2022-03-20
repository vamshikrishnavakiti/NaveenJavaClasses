package CoreJava;
//We Cannot create duplicate Methods and Method inside Method
public class MethodOverloading {
	// when method name is same with different arguments(@param)
	// With same method with same @param count not allowed
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		int Ans = obj.sum(1, 2);
		System.out.println(Ans);

	}
	public void sum() {System.out.println("Zero param");}
	public void sum(int x) {System.out.println("One Param");}
	public int sum(int x, int y) {System.out.println("2 param");
	int r = x+y;
	return r;
	}
	public void sum(double d) {      
		
	}
}
