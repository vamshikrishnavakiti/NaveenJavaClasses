package CoreJava;

public class reverseString {

	public static void main(String[] args) {
      String name = "Sangeetha";
      int length = name.length();
      String rev ="";
      for(int i= length-1; i>=0; i-- ) {
    	  rev=rev+name.charAt(i);
      }
      System.out.println("Reverse of string is :" +rev);
	}

}
