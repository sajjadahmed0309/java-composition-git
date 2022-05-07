package compo;

public class CommissionEmplyee extends PayStrategy {
	private double grossSales;
	private double commissionRates;
	
	
	public CommissionEmplyee(double grossSales,double commissionRates) {
		super();
		this.grossSales = grossSales;
		this.commissionRates = commissionRates;
	}

	

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRates() {
		return commissionRates;
	}

	public void setCommissionRates(double commissionRates) {
		this.commissionRates = commissionRates;
	}

	public double earnings() {
		double salary=commissionRates*grossSales;
		return salary;
	}

	@Override
	public String toString() {
		return "CommissionEmplyee ["+"grossSales=" + grossSales + ", commissionRates=" + commissionRates + "]";
	}
}
