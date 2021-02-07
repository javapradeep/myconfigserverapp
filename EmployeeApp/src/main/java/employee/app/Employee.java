package employee.app;

public class Employee {

	private Integer empId;
	private String  name;
	private String address;;
	private String department;
	private String team;


	public Employee() {
		super();
	}


	public Employee(Integer empId, String name, String address, String department, String team) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.department = department;
		this.team = team;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", department=" + department
				+ ", team=" + team + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
