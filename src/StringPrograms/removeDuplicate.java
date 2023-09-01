package StringPrograms;

public class removeDuplicate {

	public static void main(String[] args) {
     String name ="Vamshi Krishna";
     System.out.println(removeDuplicateChar(name));
    
     
	}
	public static String removeDuplicateChar(String str)
	{
	    String newStr="";
	    for(int i=0; i<str.length();i++)
	    {
	    	char ch = str.charAt(i);
	    	if(newStr.indexOf(ch)==-1)
	    	{
	    		newStr+=ch;
	    	}
	    }
	    return newStr ;
	}
	

}
