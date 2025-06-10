package exceptionHandling;

public class CustomException1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age = 15;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new AgeException("Age is not 18!!!");
			
		}

	}

}
