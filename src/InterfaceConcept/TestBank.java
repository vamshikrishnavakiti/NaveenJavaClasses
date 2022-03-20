package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);		
		//USBank.min_bal=200;
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.educationloan();
		hs.rateofintrest();
		USBank usb = new HSBCBank();
		System.out.println("----------------------");
		// Dynamic polymorphism
		// Child class object can nbe reffred by parent Interface reference var
		usb.credit();
		usb.debit();
		usb.rateofintrest();
	}

}
