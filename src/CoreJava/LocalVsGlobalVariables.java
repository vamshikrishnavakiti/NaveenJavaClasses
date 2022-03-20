package CoreJava;

public class LocalVsGlobalVariables {
	//Global Variables
	String name = "Siri";
	 static int age = 8;
	public static void main(String[] args) {
		//	Local Variables
		int i = 20;
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(age);
	int	Ans = obj.mul(10, 5);
	System.out.println(Ans);
	}
     public int mul(int p, int q){
    	 int r = p*q;
    	 return r;
    	    }
     
}
