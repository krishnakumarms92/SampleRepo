package exceptionHandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		int age = 15;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("Age is not 18!!!");
			
		}
	
	}
}
