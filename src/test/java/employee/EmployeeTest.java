package employee;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import job.assignment.controller.EmployeeController;
import job.assignment.domain.Employee;
import job.assignment.service.EmployeeService;

public class EmployeeTest {

	private static EmployeeService employeeServiceMock = null;
	private static EmployeeController employeeControllerMock = null;

	@Before
	public void setUp() throws Exception {
		employeeServiceMock = Mockito.mock(EmployeeService.class);
		employeeControllerMock= Mockito.mock(EmployeeController.class);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void saveTest() {
		/*Employee emp = new Employee(01, "testFirstName", "testLastName", 1);
		Employee employee = Mockito.mock(Employee.class);
		employeeControllerMock.
		employeeServiceMock.save(emp);
		Mockito.when(employeeServiceMock.save(employee))).thenReturn(emp);*/

	}

}
