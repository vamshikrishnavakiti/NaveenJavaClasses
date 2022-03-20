package StringPrograms;// Use of Static Keyword

public class employee {
	int empId;
	String empName;
	static String empCompany;
	employee(int empid, String empname){
		this.empId=empId;
		this.empName=empName;  
	}
	void display() {
		System.out.println(empId+" "+empName + ""+empCompany);
	}
	public static void main(String[] args) {
		employee E1 = new employee(100, "Vamshi");
		E1.display();
		employee E2 = new employee(101, "Rahul");
		E2.display();
		
		
	}

}
