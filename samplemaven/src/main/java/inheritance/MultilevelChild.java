package inheritance;

public class MultilevelChild extends MultilevelParent {
	public void print() {
		System.out.println("I am child");
	}

	public static void main(String[] args) {
		
		MultilevelChild obj = new MultilevelChild();
		
		obj.display();
		obj.show();
		obj.print();
		look();
		

	}

}
