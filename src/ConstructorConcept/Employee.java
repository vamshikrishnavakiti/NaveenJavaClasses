package ConstructorConcept;

public class Employee {
String name;
int empid;
Employee(String Name, int empId){
	this.name=Name;
	this.empid=empId;
}
 public static void main(String[] args) {
	 Employee e1= new Employee("vamshi", 101);
	 Employee e2= new Employee("Krishna", 102);
	 System.out.println(e1.name+" "+e1.empid);
	 System.out.println(e2.name+" "+e2.empid);
 }
	
	
}
