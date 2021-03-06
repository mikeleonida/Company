package company;

public class SalesDept extends Department {
	public final int UNITS_SOLD_TARGET = 50;
	public final String DEPARTMENT_INCENTIVE = "comission";
		
	public SalesDept() {
		super();
	}
	
	public SalesDept(Employee[] es) {
		super(es);
	}

	public boolean isIncentiveEligible(Employee e) {
		if (findEmployee(e) && (e.getUnitsSoldOrProduced() >= UNITS_SOLD_TARGET)) {
			return true;
		}
		return false;
	}
	 
	
}
