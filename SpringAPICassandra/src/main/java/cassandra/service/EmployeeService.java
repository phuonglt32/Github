package cassandra.service;

import java.util.List;

import cassandra.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public Employee getEmployee(int id);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);

	public List<Employee> getAllEmployees();
}
