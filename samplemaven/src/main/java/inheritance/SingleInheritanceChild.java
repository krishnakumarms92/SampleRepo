package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent {
	public void display() {
		System.out.println("Single Inheritance Child");
	}

	public static void main(String[] args) {

		SingleInheritanceChild obj = new SingleInheritanceChild();
		obj.show();
		obj.display();

	}

}
