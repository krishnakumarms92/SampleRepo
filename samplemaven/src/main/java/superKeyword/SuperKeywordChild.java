package superKeyword;

public class SuperKeywordChild extends SuperVariableKeyword{
	
	String name = "Java";
	
	public void print()
	{
		
		System.out.println(super.name);
		System.out.println(name);
	}
	
	

	public static void main(String[] args) {
		
		SuperKeywordChild obj = new SuperKeywordChild()	;
		obj.print();
		
	}
}
