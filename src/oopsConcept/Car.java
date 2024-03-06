package oopsConcept;

public class Car {

	private String color;
	private String make;
	private String model;
	private int year;
	private String owner;
	
public static void main(String[] args) {
	System.out.println();
	
}
public void setMake(String make) {
	this.make = make;
}
public String getMake() {
	return this.make;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(  int year) {
	if (year > 1990)
		this.year = year;
	else {
		System.out.println("This is not a valid year");
	}
	
	
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	if (owner =="Vamshi")
	this.owner = owner;
	else {
		System.out.println("Not Valid Owner");
	}
}

}
