package company;

public class Company {
	private SalesDept sales;
	private ProductionDept production;
	
	public Company(SalesDept sales, ProductionDept production) {
		super();
		this.sales = sales;
		this.production = production;
	}

	public SalesDept getSales() {
		return sales;
	}

	public void setSales(SalesDept sales) {
		this.sales = sales;
	}

	public ProductionDept getProduction() {
		return production;
	}

	public void setProduction(ProductionDept production) {
		this.production = production;
	}

	@Override
	public String toString() {
		return "Company [sales=" + sales + ", \nproduction=" + production + "]";
	}
	
	
	
}
