package git_test.entities;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
