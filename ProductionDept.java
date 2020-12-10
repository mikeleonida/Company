package company;

public class ProductionDept extends Department implements PaidOvertime {
	public final int UNITS_PRODUCED_TARGET = 40;
	public final String DEPARTMENT_INCENTIVE = "bonus";
	
	public ProductionDept() {
		super();
	}
	
	public ProductionDept(Employee[] es) {
		super(es);
	}

	@Override
	public boolean isIncentiveEligible(Employee e) {
		if (findEmployee(e) && (e.getUnitsSoldOrProduced() >= UNITS_PRODUCED_TARGET)) {
			return true;
		}
		return false;
	}

	@Override
	public double calculateOvertimePay(Employee e) {
		if (!findEmployee(e)) {
			return 0;
		}
		double otHours = e.getWorkHours() - OVERTIME_HOURS_THRESHOLD;
		if (otHours > 0) {
			return otHours * OVERTIME_RATE * e.getHourlyPayRate();
		}
		return 0;
	}

	@Override
	public double calculatePay(Employee e) {
		if (!findEmployee(e)) {
			return 0;
		}
		if (e.getWorkHours() <= OVERTIME_HOURS_THRESHOLD) {
			return super.calculatePay(e);
		}
		
		return (OVERTIME_HOURS_THRESHOLD * e.getHourlyPayRate() + 
				((e.getWorkHours() - OVERTIME_HOURS_THRESHOLD) * OVERTIME_RATE * e.getHourlyPayRate()));
	}
	
	
}
