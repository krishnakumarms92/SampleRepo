package interfaceExample;

public class InterfaceChild implements Interface1{
	
	public void show() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
		
		//object creation
		InterfaceChild obj  = new InterfaceChild();	
		obj.display();
		obj.print();
		obj.show();
		
		// reference creation example
		Interface1 obj1 = new InterfaceChild(); 
		obj1.display();
		obj1.print();
		
	}

	@Override
	public void display() {
		System.out.println("Parent Interface");
	}

	@Override
	public void print() {
		System.out.println("New ");
		
	}
}
