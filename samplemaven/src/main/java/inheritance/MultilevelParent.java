package inheritance;

public class MultilevelParent extends MultilevelGrandParent 
{
	
	public void show()
	{
		System.out.println("I am Parent");
	}
	
	static void look()
	{
		System.out.println("Static parent");
	}

}
