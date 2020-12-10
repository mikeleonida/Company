package company;

public class Main {

	public static void main(String[] args) {
		Employee mike = new Employee("Mike L", "Production", 45.00);
		mike.setWorkHours(40);
		Employee manny = new Employee("Emmanuel T", "Production", 40.00);
		manny.setWorkHours(45);
		Employee harish = new Employee("Harish", "Sales", 50.00);
		harish.setWorkHours(25);
		Employee sean = new Employee("Sean D", "Sales", 35.00, 45.00, 55);
		sean.setWorkHours(20);
		sean.addToWorkHours(35);
		
		Employee[] salesEmps = new Employee[2];
		Employee[] productionEmps = new Employee[2];
		
		salesEmps[0] = harish;
		salesEmps[1] = sean;
		
		productionEmps[0] = mike;
		productionEmps[1] = manny;
		
		SalesDept sd = new SalesDept(salesEmps);
		ProductionDept pd = new ProductionDept(productionEmps);
		
		Company co = new Company("Sales & Production Unlimited, Inc.", sd, pd);
		System.out.println(co);
		
		System.out.println("**********************************");
		
		mike.setUnitsSoldOrProduced(100);
		manny.setUnitsSoldOrProduced(20);
		harish.setUnitsSoldOrProduced(250);
		
		for (Employee e : co.getSales().getEmployees()) {
			System.out.println(e.getName() + " is eligible for " + co.getSales().DEPARTMENT_INCENTIVE 
					+ " : " + co.getSales().isIncentiveEligible(e));
		}
		for (Employee e : co.getProduction().getEmployees()) {
			System.out.println(e.getName() + " is eligible for " + co.getProduction().DEPARTMENT_INCENTIVE 
					+ " : " + co.getProduction().isIncentiveEligible(e));
		}
		
		System.out.println("**********************************");
		mike.setName("Mike Leo");
		System.out.println(co);
		
		System.out.println("**********************************");
		
		for (Employee e : co.getProduction().getEmployees()) {
			System.out.println(e.getName() + " earned " + co.getProduction().calculateOvertimePay(e) 
					+ " in overtime pay.");
		}
		for (Employee e : co.getSales().getEmployees()) {
			System.out.println(e.getName() + " earned " + co.getProduction().calculateOvertimePay(e) 
					+ " in overtime pay.");
		}
		
		System.out.println("**********************************");
		
		for (Employee e : co.getProduction().getEmployees()) {
			System.out.println(e.getName() + " earned " + co.getProduction().calculatePay(e) 
					+ " in total pay.");
		}
		for (Employee e : co.getSales().getEmployees()) {
			System.out.println(e.getName() + " earned " + co.getSales().calculatePay(e) 
					+ " in total pay.");
		}
		
	}

}
