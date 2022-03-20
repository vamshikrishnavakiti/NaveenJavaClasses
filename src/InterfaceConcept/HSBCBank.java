package InterfaceConcept;

public class HSBCBank implements USBank, BRAZILBank {// Multiple Inheritance
	//If a class is implementing any interface, Then its mandatory to declare all the methods of parent class

	public void credit() {System.out.println("HSBC Credit");}
	public void debit() {System.out.println("HSBC Debit");}
	public void rateofintrest() {System.out.println("HSBC ROI");}
	public void educationloan() {System.out.println("HSBC_EDu_Loan");}
	// Brazil Bank Methods
	public void mutualfund() {System.out.println("HSBC_Mutualfund");}
	public void Publicfund() {System.out.println("HSBC_Publicfund");}


}



