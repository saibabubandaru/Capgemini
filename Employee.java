package SqlAssignment;
public class Employee {

	 private int id;
	 private String name;
	 private String office;
	 private String department;
	 private String team;
	 
	 public Employee(int id, String name, String office, String department, String team) {
			super();
			this.id = id;
			this.name = name;
			this.office = office;
			this.department = department;
			this.team = team;
	 }
	 
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", office=" + office + ", department=" + department + ", team="
				+ team + "]";
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
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	}