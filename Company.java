package company;

public class Company {
	private String name;
	private SalesDept sales;
	private ProductionDept production;
	
	public Company() {
		super();
	}

	public Company(SalesDept sales, ProductionDept production) {
		super();
		this.name = "";
		this.sales = sales;
		this.production = production;
	}

	public Company(String name, SalesDept sales, ProductionDept production) {
		super();
		this.name = name;
		this.sales = sales;
		this.production = production;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Company " + name + "\nSales " + sales + ", \nProduction " + production + "]";
	}
	
	
	
}
