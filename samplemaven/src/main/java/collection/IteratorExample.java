package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {

		Set<String> a = new HashSet<String>();
		
		a.add("White");
		a.add("green");
		a.add("red");
		a.add("purple");
		
		System.out.println("Set eg: "+a);
		
	//Iterator object creation	
			Iterator i = a.iterator();
			while(i.hasNext())					//to check next element is there or not
			{
				System.out.println(i.next());	// to print the element
			}
	
	//Remove method
			i.remove();
			System.out.println(a);
	
	//Print using foreach loop
		int arr[] = {1,50,98,75};
		for(int b : arr)					//Syntax: for(DataType variableName : ArrayName) 		
		{
			System.out.println(b);
		}
	}
	
}
