package StringPrograms;

public class LowerUpperStringCount {

	public static void main(String[] args) {
	
		String s = "Hello VamshI KrIshna";
		int Upper =0;
		int Lower =0;
		for(int i=0; i<=s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				Upper++;
			}
			else {
				Lower++;
				}
		}
		System.out.println("Upper Case:"+Upper);
		System.out.println("Lower Case:"+Lower);

	}

}
