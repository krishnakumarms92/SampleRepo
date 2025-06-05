package exceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		//try block
		try 
		{
			int c = a / b;
		}

		// catch block
		catch (ArithmeticException e)
		{
			b = 2;
			int d = a / b;
			System.out.println(d);
			System.out.println(e);
		}

		// finally block
		finally 
		{
			b = 5;
			int d = a / b;
			System.out.println(d);
		}
	}
}
