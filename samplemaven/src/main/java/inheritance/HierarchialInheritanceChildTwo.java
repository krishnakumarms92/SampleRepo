package inheritance;

public class HierarchialInheritanceChildTwo extends HierarchialInheritanceParent {

	public void list()
	{
		System.out.println("Im hierarchial - Child2");
	}
	public static void main(String[] args) {

		HierarchialInheritanceChildTwo obj = new HierarchialInheritanceChildTwo();
		obj.list();
		print();
	}


}
