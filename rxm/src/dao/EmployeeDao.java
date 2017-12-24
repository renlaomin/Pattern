package dao;

import java.util.List;


public interface EmployeeDao {
	 public List<Employee> getAll();

	  public Employee get(int id);

	  public void updateStudent(Employee student);

	  public void delete(Employee student);
}
