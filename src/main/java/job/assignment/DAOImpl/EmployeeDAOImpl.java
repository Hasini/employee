package job.assignment.DAOImpl;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import job.assignment.dao.CommonDAO;
import job.assignment.domain.Department;
import job.assignment.domain.Employee;

public class EmployeeDAOImpl implements CommonDAO {

	private SessionFactory sessionFactory;

	public void save(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
	}

	/* Implemented in Department */
	public void save(Department emp) {

	}

	public Employee get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> empList() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		Query<Employee> employeeQuery = session.createQuery(query);
		return employeeQuery.getResultList();
	}

	public void updateEmployee(long id, Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		emp = session.byId(Employee.class).load(id);
		emp.setFirstName(emp.getFirstName());
		emp.setLastName(emp.getLastName());
		session.flush();
	}

	public void deleteEmployee(long id) {
		Session session = sessionFactory.getCurrentSession();
		Employee emp = session.byId(Employee.class).load(id);
		session.delete(emp);
	}

}
