package CoreJava;

public class WrapperClass {

	public static void main(String[] args) {
   String a = "100";
   System.out.println(a+20);
// String to Integer conversion by "Integer.parseInt"method.
   int i = Integer.parseInt(a);
   System.out.println(i+20);
   // String to Double conversion
      String x = "12.22";
     double d = Double.parseDouble(x);
      System.out.println(d+10);
      // Int to String conversion
      int j =100;
      System.out.println(j+20);
    String s =  String.valueOf(j);
    System.out.println(s+20);
	}

}
