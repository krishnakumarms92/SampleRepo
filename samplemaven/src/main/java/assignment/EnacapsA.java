package assignment;

public class EnacapsA {
	private String name;
	private int id;
	
	public void setData(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	public void getData() {
		System.out.println(name+" "+id);
	}
}
