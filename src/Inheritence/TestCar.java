package Inheritence;

public class TestCar {

	public static void main(String[] args) {
		//		static polymorphism -- compile- time polymorphism
		Bmw b= new Bmw();
		b.start();
		b.GPS();
		b.stop();
		b.theftsafty();
		b.Body();

		System.out.println("------------------------");
		car c =new car();
		c.start();
		c.stop();
		System.out.println("*********************");
		car c1 = new Bmw();// Dynamic Polymorphism
		c1.start();
		c1.stop();
		c1.doors();
		//Bmw b1 = (Bmw)new car();// ClasscaseException
		b.Body();
	}


}
