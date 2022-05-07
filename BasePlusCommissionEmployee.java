package compo;

public class BasePlusCommissionEmployee extends CommissionEmplyee {
	private double baseSalary;
	public BasePlusCommissionEmployee( double grossSales,
			double commissionRate,double baseSalary) {
		super(grossSales, commissionRate);
		this.baseSalary=baseSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double earnings() {
		double salary=(getCommissionRates()*getGrossSales())+baseSalary;
		return salary;
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee ["+"baseSalary=" + baseSalary + "]";
	}
	

}
