package compo;

public class SalariedEmployee extends PayStrategy {
	private double weeklySalary;
	
	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double earnings() {
		
		return weeklySalary; 
	}
}
