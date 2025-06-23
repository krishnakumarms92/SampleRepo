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
		
		//addAll()
		Set <String> a = new HashSet <String>();
		a.add("apple");
		a.add("grapes");
		a.add("plum");
		
		s.addAll(a);
		System.out.println(s);
		
		
		//contains()
		System.out.println(s.contains("Jim"));
		
		//containsAll()
		System.out.println("contains All: " +s.containsAll(a));
		System.out.println("contains All: " +a.containsAll(s));
		
		//removeAll()
		s.removeAll(a);
		System.out.println("Remove All: "+ s);
		
		//clear
		a.clear();
		System.out.println("Clear: "+ a);
		
		//isEmpty()
		System.out.println("Is Empty: "+s.isEmpty());
		
		//remove()
		s.remove("David");
		System.out.println("remove: "+s);
		
		//size
		System.out.println("size: "+s.size());
		
		
	}

}
