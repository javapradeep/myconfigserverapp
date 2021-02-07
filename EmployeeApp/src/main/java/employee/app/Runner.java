package employee.app;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	//private static final Employee  = null;

	public Runner() {
		// TODO Auto-generated constructor stub
		loadData();
	}

	List<Employee> employees=new ArrayList<Employee>();
	List<User> users=new ArrayList<User>();

	private void loadData() {
		// TODO Auto-generated method stub
		employees.add(new Employee(1, "Albert","Dehli","IT","Team A"));
		employees.add(new Employee(2, "Chris","Pune","IT", "Team B"));
		employees.add(new Employee(3, "Emily","Mumbai","Finance","Team C"));
		employees.add(new Employee(4, "Cherly","Hydrabad","HR","Team D"));
		employees.add(new Employee(5, "Jarden","Dehli","HR","Team A"));
		employees.add(new Employee(6, "Mitchell","Hydrabad","IT","Team B"));
		employees.add(new Employee(7, "Russel","Mumbai","IT","Team C"));
		employees.add(new Employee(8, "Tyler","Mumbai","IT","Team D"));
		employees.add(new Employee(9, "David","Pune","HR","Team A"));
		employees.add(new Employee(10, "Henri","Hydrabad","IT","Team B"));
		employees.add(new Employee(11, "Brady","Dehli","HR","Team R"));
		employees.add(new Employee(12, "Rica","Pune","IT","Team D"));
		employees.add(new Employee(13, "Kylie","Chennai","IT","Team C"));
		employees.add(new Employee(14, "Sara","Delhi","Finance","Team D"));


		//User Object
		User user1=new User(1,"John");
		User user2=new User(2,"Tom");
		User user3=new User(3,"Adam");
		User user4=new User(4,"Lina");

		//Access All Employee
		employees.addAll(employees);

		//get Employee
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

	}
	public int getEmployeeCount() {
		return employees.size();
	}
	public int getUserCount() {
		return users.size();
	}

	public List<Employee> getEmployeesByUserId(int UserId){
		return employees;
	}
	public Employee getEmployee(int id) {
		return getEmployee(id);

	}
	
	//1.From TestPermission Class-->1.runner.addNewEmployee(newEmployee);
	public void getEmployeesByUserId(Employee newEmployee) {
		// TODO Auto-generated method stub 
		// Write code here
		
		
	}
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
