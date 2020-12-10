package company;

import java.util.Arrays;

public abstract class Department {
	private Employee[] employees;
	
	public Department() {
		super();
	}

	public Department(Employee[] es) {
		super();
		this.employees = es;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}	
	
	public boolean findEmployee(Employee e) {
		for (Employee deptEmp : employees) {
			if (deptEmp.getEmployeeId() == e.getEmployeeId()) {
				return true;
			}
		}
		return false;
	}
	
	public abstract boolean isIncentiveEligible(Employee e);
	
	public double calculatePay(Employee e) {
		if (findEmployee(e)) {
			return (e.getWorkHours() * e.getHourlyPayRate());
		}
		
		return 0;
	}

	@Override
	public String toString() {
		return "Department [employees=" + Arrays.toString(employees) + "]";
	}
	
	
}
