package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		//add
		s.add("David");
		s.add("Jim");
		s.add("Vincent");
		s.add("Harley");
		System.out.println(s);
		
		//contains()
		System.out.println(s.contains("Jim"));
		
		//isEmpty()
		System.out.println(s.isEmpty());
		
		//remove()
		s.remove("David");
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		
		//clear
	}

}
