package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharectors {
 
	
	public static void main(String[] args) {
		String str ="Vamshi Krishna";
		int strLength=str.length();
		Set<Character> set = new HashSet<>();	
for(int i=0; i<strLength; i++) {
	Character ch = str.charAt(i);
	if(set.contains(ch)) {
		System.out.println(ch);		
	}else {
		set.add(ch);
	}
}
	}

}
