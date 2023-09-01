package CoreJava;

public class UppercaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " IiguaTThhFFGFF";
		int uppercaseCount = 0;
		
		for(int i =0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercaseCount++;
				
			}
			
		}
		System.out.println("Upper case count="+uppercaseCount);
	}

}
