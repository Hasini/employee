package job.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import job.assignment.domain.Employee;
import job.assignment.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<?> save(@RequestBody Employee emp) {
		employeeService.save(emp);
		return ResponseEntity.ok().body("Employee added successfully");
	}

	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> get(@PathVariable("empId") int empId) {
		Employee employee = employeeService.get(empId);
		return ResponseEntity.ok().body(employee);
	}

	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> list() {
		List<Employee> empList = employeeService.empList();
		return ResponseEntity.ok().body(empList);
	}

	@PutMapping("/book/{empId}")
	public ResponseEntity<?> update(@PathVariable("empId") int empId, @RequestBody Employee employee) {
		employeeService.updateEmployee(empId, employee);
		return ResponseEntity.ok().body("Employee has been updated successfully.");
	}

	@DeleteMapping("/book/{empId}")
	public ResponseEntity<?> delete(@PathVariable("empId") int empId) {
		employeeService.deleteEmployee(empId);
		return ResponseEntity.ok().body("Employee no more exsist.");
	}

}
