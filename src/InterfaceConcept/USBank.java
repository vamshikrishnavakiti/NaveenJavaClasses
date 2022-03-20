package InterfaceConcept;

public interface USBank {

	int min_bal = 100;// The variable defined in the Interface are Static and Final in nature.
	
	public void credit();
	public void debit();
	public void rateofintrest();

	
	/*only method declaration
	 * No method body- Only method prototype
	 * In interface, we can declare the variable, vars are by deault static in nature
	 * vars value will not be changed
	 * no static method in interface
	 * we canot create object of interface
	 * interface is in abstract in nature
	 */
}
