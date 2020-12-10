package company;

public class Employee {
	private String employeeId;
	private String name;
	private double hourlyPayRate;
	private double workHours;
	private int unitsSoldOrProduced;
	
	private static int lastIdNumber;
	
	public final String SALES_DEPT_CODE = "01_Sales";
	public final String PRODUCTION_DEPT_CODE = "02_Production";
	
	static {
		lastIdNumber = 100;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, String department, double hourlyPayRate) {
		this(name, department, hourlyPayRate, 0.0, 0);
	}
	
	public Employee(String name, String department, double hourlyPayRate, double workHours, int unitsSoldOrProduced) {
		super();
		this.name = name;
		this.hourlyPayRate = hourlyPayRate;
		this.workHours = workHours;
		this.unitsSoldOrProduced = unitsSoldOrProduced;
		
		if (department.compareToIgnoreCase("sales") == 0) {
			this.employeeId = SALES_DEPT_CODE + "_" + (lastIdNumber++);
		} else {
			this.employeeId = PRODUCTION_DEPT_CODE + "_" + (lastIdNumber++);
		}
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	
	public void addToWorkHours(double addlWorkHours) {
		workHours += addlWorkHours;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public int getUnitsSoldOrProduced() {
		return unitsSoldOrProduced;
	}

	public void setUnitsSoldOrProduced(int unitsSoldOrProduced) {
		this.unitsSoldOrProduced = unitsSoldOrProduced;
	}

	@Override
	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", name=" + name + ", workHours=" + workHours + ", hourlyPayRate="
				+ hourlyPayRate + ", unitsSoldOrProduced=" + unitsSoldOrProduced + "]";
	}
	

	
}
