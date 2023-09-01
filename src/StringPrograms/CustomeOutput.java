package StringPrograms;

public class CustomeOutput {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				System.out.print("hello" + i);
			}

			
			  if (i < 6) { System.out.print(" "); }
			 
		}
	}
}
