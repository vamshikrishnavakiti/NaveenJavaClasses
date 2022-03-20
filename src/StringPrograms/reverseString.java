package StringPrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name = "ABCDEFGH";
         int length = name.length();
         String str="";
         
         for(int i= length-1; i>=0; i--) 
         {
        	 str=str+name.charAt(i);
        	 
         }
         
        System.out.println(str);
	}

}
