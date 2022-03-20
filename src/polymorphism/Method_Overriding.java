package polymorphism;

public class Method_Overriding {
	
	
	void show(int Salary ,String name) {
		System.out.println("Employee 1");
	}
}
class Test extends Method_Overriding
{
	void show(int Salary ,String name) 
	{
		System.out.println("Employee 2");
		
	}
	public static void main(String[] args)
	
	{
		Method_Overriding m = new Method_Overriding();
		m.show(2000, "vamshi");
		
		
	}


}


