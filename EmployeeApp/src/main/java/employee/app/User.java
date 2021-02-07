package employee.app;

public class User {

	private  int id;
	private String name;
	private String address;;
	private String department;
	private String team;
	
	public User() {
		super();
	}
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.address = address;
		//this.department = department;
		//this.team = team;
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
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department + ", team="
				+ team + "]";
	}
}
