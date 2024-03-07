package QT_Training;

public class bankOperations {
    public void display() {
    	System.out.println("------------------------");
    }
	static int currentBalance = 1000;
	public static void greetings() {
		System.out.println("Welcome to the Bank");
	}
	public void deposite(int amount) {
		currentBalance = currentBalance+amount;
		
	}
	public static void withdraw(int amount) {
		currentBalance = currentBalance-amount;
	}
	public int getCurrentbalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		bankOperations bank = new bankOperations();
		greetings();
		bank.display();
		bank.deposite(5000);
		bank.display();
		bank.getCurrentbalance();
		System.out.println(bank.getCurrentbalance());
		withdraw(4000);
		bank.display();
		System.out.println("Available Balance :"+bank.getCurrentbalance());
		
	}
}
