package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraysConcepts {
	
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		li.add("Vamshi");
		li.add("Naveen");
		li.add("Sai");
		
		Iterator it = li.iterator();
		while(it.hasNext());
		System.out.println(it.next());
		
		
	}

}
