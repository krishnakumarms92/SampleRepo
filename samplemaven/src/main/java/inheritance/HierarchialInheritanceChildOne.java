package inheritance;

public class HierarchialInheritanceChildOne extends HierarchialInheritanceParent
{
	public void show()
	{
		System.out.println("Im hierarchial - Child1");
	}
	public static void main(String[] args) {

		HierarchialInheritanceChildOne obj = new HierarchialInheritanceChildOne();
		obj.show();
		print();

	}

}
