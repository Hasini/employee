package job.assignment.service;

import java.util.List;

import job.assignment.domain.Department;
import job.assignment.domain.Employee;

public interface EmployeeService {
	void save(Employee emp);

	Employee get(int empId);

	List<Employee> empList();

	void updateEmployee(int empId, Employee emp);

	void deleteEmployee(int empId);

}
