package polymorphism;

public class PolymorphismChildClass extends PolymorphismParentClass{
	
	public void display()
	{
		super.display();  	//Method Overriding (super.parentClass Method is called here)
							
		System.out.println("Polymorphism");
	}

	public static void main(String[] args) {
		PolymorphismChildClass obj = new PolymorphismChildClass();
		obj.display();

	}

}
