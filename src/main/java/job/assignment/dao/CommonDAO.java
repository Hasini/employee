package job.assignment.dao;


import java.util.List;

import job.assignment.domain.Department;
import job.assignment.domain.Employee;

public interface CommonDAO {
	void save(Employee emp);

	void save(Department emp);

	Employee get(long id);

	List<Employee> empList();

	void updateEmployee(long id, Employee emp);

	void deleteEmployee(long id);

}
