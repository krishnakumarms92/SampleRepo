package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List <String> s = new ArrayList<String>();
		
		//add()
		s.add("green");
		s.add("blue");
		s.add("red");
		//s.add("blue");
		System.out.println(s);
		
		//get()
		System.out.println(s.get(0));
		
		//set()		
		s.set(1, "White"); 
		System.out.println(s);
		
		//indexOf()
		System.out.println(s.indexOf("red"));
		
		//lastIndexOf()
		System.out.println(s.lastIndexOf("White"));
		
		//remove()
		s.remove(0);
		System.out.println(s);
		
		//contains()
		System.out.println(s.contains("red"));
		
		//isEmpty()
		System.out.println(s.isEmpty());
		
		//size()
		System.out.println(s.size());
		
		
		
		
		
		
		
		
		
		
	}
}
