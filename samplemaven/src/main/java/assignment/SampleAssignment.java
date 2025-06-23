package assignment;

public class SampleAssignment {
	int a;
	int b;
	int c;
	public SampleAssignment(int a, int b)
	{
		c= a+b;
		System.out.println("Sum is :" + c);
	}
	public void sum() {
	 int avg = c/2;
	System.out.println(avg);
	}

	public static void main(String[] args) {
	SampleAssignment obj = new SampleAssignment(10, 20);
	obj.sum();
		
	}

}
