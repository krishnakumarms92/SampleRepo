package superKeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	
	public SuperConstructorChild()
	{
		super(5, 10);
		System.out.println("Hey");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild obj = new SuperConstructorChild();
	}
}
