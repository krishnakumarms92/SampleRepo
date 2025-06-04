package abstraction;

public class AbstractionChild extends AbstractionParent{
	
	public void show() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		
		/*
		 * AbstractionChild obj = new AbstractionChild();  //object creation
		 * obj.display();
		 *  obj.print();
		 * obj.show();
		 */
		
		AbstractionParent obj = new AbstractionChild();	//reference creation
		obj.display();
		obj.print();
		
		
	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		System.out.println("Java");
		
	}

}
