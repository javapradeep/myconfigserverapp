package employee.app;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

public class TestPermission {

	@Test
	public void updateEmployeeTest() {
		Runner runner=new Runner();
		Employee emp=runner.getEmployee(7);
		emp.setName("New Name");
		emp.setDepartment("New Department");
		emp.setAddress("New Address");
		assertThat(emp.getName(), equalTo("New Name"));
		assertThat(emp.getDepartment(), equalTo("new Department"));
		assertThat(emp.getAddress(), equalTo("new Address"));

	}

	private void assertThat(String name, Matcher<String> equalTo) {
		// TODO Auto-generated method stub

	}
	@Test
	public void testForUserJohn() {
		Runner runner=new Runner();
		List<Employee> employees=runner.getEmployeesByUserId(1);
		Assert.assertThat(employees.size(), equalTo(9));
	}

	@Test
	public void testForUserTom() {
		Runner runner=new Runner();
		List<Employee> employees=runner.getEmployeesByUserId(2);
		Assert.assertThat(employees.size(), equalTo(7));
	}
	@Test
	public void testForUserAdam() {
		Runner runner=new Runner();
		List<Employee> employees=runner.getEmployeesByUserId(3);
		Assert.assertThat(employees.size(), equalTo(7));
	}
	@Test
	public void testForUserLina() {
		Runner runner=new Runner();
		List<Employee> employees=runner.getEmployeesByUserId(4);
		Assert.assertThat(employees.size(), equalTo(8));
	}

	@Test
	public void addEmployeeTestUserAccess() {
		Runner runner=new Runner();
		Employee newEmployee=new Employee(17,"New Employee ","Pune  ","IT "," Team B");
		//1.runner.addNewEmployee(newEmployee);
		runner.getEmployeesByUserId(newEmployee);
		Assert.assertThat(runner.getEmployeesByUserId(1).size(), equalTo(10));
		Assert.assertThat(runner.getEmployeesByUserId(2).size(), equalTo(7));
		Assert.assertThat(runner.getEmployeesByUserId(4).size(), equalTo(8));
		Assert.assertThat(runner.getEmployeesByUserId(4).size(), equalTo(8));

	}
	@Test
	public void addEmployeeTestUserAccess2() {
		Runner runner=new Runner();
		Employee newEmployee=new Employee(17,"New Employee ","Delhi  ","IT "," Team B");
		//1.runner.addNewEmployee(newEmployee);
		runner.getEmployeesByUserId(newEmployee);
		Assert.assertThat(17 , equalTo(runner.getEmployeeCount()));
		Assert.assertThat(runner.getEmployeesByUserId(1).size(), equalTo(9));
		Assert.assertThat(runner.getEmployeesByUserId(2).size(), equalTo(8));
		Assert.assertThat(runner.getEmployeesByUserId(3).size(), equalTo(7));
		Assert.assertThat(runner.getEmployeesByUserId(4).size(), equalTo(9));

	}
	@Test
	public void updateEmployeeTestUserAccess() {
		Runner runner=new Runner();
		Employee employee=runner.getEmployee(9);
		employee.setDepartment("IT");
		employee.setAddress("Mumbai");
		employee.setTeam("Team B");
		//Employee newEmployee=new Employee(17,"New Employee ","Delhi  ","IT "," Team B");
		//1.runner.addNewEmployee(newEmployee);
		//runner.getEmployeesByUserId(newEmployee);
		Assert.assertThat(17 , equalTo(runner.getEmployeeCount()));
		Assert.assertThat(runner.getEmployeesByUserId(1).size(), equalTo(10));
		Assert.assertThat(runner.getEmployeesByUserId(2).size(), equalTo(8));
		Assert.assertThat(runner.getEmployeesByUserId(3).size(), equalTo(6));
		Assert.assertThat(runner.getEmployeesByUserId(4).size(), equalTo(8));

	}
	
	public void newUserTest() {
		Runner runner=new Runner();
		User user=new User(5, "New User");
		//
		//Rule:1::Acess To Team =Team B
		//Rule:2::Acces to Department=Finanace
		
		runner.addNewUser(user);
		Assert.assertThat(runner.getEmployeesByUserId(5).size(), equalTo(6));
	}

}
