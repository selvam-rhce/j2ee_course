package dev.selvam.assignment11.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional(readOnly = false)
	@Override
	public void saveEmployee(Employee e) {
		ht.save(e);
	}

	@Transactional(readOnly = false)
	@Override
	public void updateEmployee(Employee e) {
		ht.update(e);
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		ht.delete(e);
		
	}

	@Override
	public Employee getById(int id) {
		Employee e=(Employee)ht.get(Employee.class,id);
		return e;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> list=new ArrayList<Employee>(); 
		list = ht.loadAll(Employee.class); 
		return list;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public Employee findEmployee(String name) {
		List<Employee> empList = new ArrayList<Employee>();
		String findQuery = "from Employee as emp where emp.name = ?0";
		empList = (List<Employee>) ht.find(findQuery, name);
		return empList.get(0);
	}

}
