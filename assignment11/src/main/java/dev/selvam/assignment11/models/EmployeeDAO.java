package dev.selvam.assignment11.models;

import java.util.List;

public interface EmployeeDAO {
	
	public void saveEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public Employee getById(int id);
	public List<Employee> getEmployees();
	public Employee findEmployee(String name);

}
