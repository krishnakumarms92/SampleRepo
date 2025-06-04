package interfaceExample;

public class MultipleChild implements Multiple1, Multiple2{
	
	public static void main(String[] args) {
		
		MultipleChild obj = new MultipleChild();
		obj.meth1();
		obj.meth2();
		
	}

	@Override
	public void meth2() {
		
		System.out.println("meth 2");
	}

	@Override
	public void meth1() {

		System.out.println("meth 1");
		
	}

}
