package EmployeeRecord;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String branch;
	
	private int salary;

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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
	
	}

	public Employee(int id, String name, String branch, int salary) {
	
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", branch=" + branch + ", salary=" + salary + "]";
	}
	
	

}
