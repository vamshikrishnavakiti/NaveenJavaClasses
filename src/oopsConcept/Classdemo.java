package oopsConcept;

public class Classdemo {

	public static void main(String[] args) {
		
		Car Benz = new Car();
		Benz.setMake("BMW");	
		System.out.println(Benz.getMake());


		Car Benz1 = new Car();
		Benz1.setColor("Red");
		System.out.println(Benz1.getColor());

		Car Benz2 = new Car();
		Benz2.setYear(1800);
		System.out.println(Benz1.getYear());

		Car Owner = new Car();
		Owner.setOwner("Rahul");
		System.out.println("Owner of Car is "+Owner.getOwner());



	}


}
