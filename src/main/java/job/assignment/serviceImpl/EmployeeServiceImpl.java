package job.assignment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import job.assignment.dao.CommonDAO;
import job.assignment.domain.Employee;
import job.assignment.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private CommonDAO employeeDAO;

	public void save(Employee emp) {
		employeeDAO.save(emp);
		
	}
	public List<Employee> empList() {
		employeeDAO.empList();
		return null;
	}

	public void updateEmployee(int empId, Employee emp) {
		employeeDAO.updateEmployee(empId, emp);
	}

	public void deleteEmployee(int empId) {
		employeeDAO.deleteEmployee(empId);
	}

	public Employee get(int empId) {
		return null;
	}
	

}
