package compo;

public class HourlyEmployee extends PayStrategy {
	private double wage;
	private double hours;
	

	public HourlyEmployee(double wage,double hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}


	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}
	public double earnings() {
		double salary;
		if(hours<=40)
		{
			salary =wage*hours;
			return salary;
		}
		else
		{
			salary=40*wage*(hours-40)*wage*1.5;
			return salary;
		}
		
	}


	@Override
	public String toString() {
		return "HourlyEmployee ["+"wage=" + wage + ", hours=" + hours + "]";
	}

}
