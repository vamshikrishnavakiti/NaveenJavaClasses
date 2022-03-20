package Arrays;

 class StaticKeyword {
	int epmId;
	String empName;
	static String company="Accolite";
	StaticKeyword(int EmpID, String EmpName){
	this.epmId=EmpID;
	this.empName=EmpName;
	
	}
    void Display() {
    	System.out.println(epmId+"  "+empName+"  "+company);
    }
	public static void main(String[] args)
	{
		StaticKeyword e1 = new StaticKeyword(100, "Vamshi");
		e1.Display();
		StaticKeyword e2 = new StaticKeyword(101, "Krishna");
		e2.Display();
		StaticKeyword e3 = new StaticKeyword(102, "Rahul");
		e3.Display();
		
	}
	

}
