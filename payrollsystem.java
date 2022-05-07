package compo;

public class payrollsystem {

	public static void main(String[] args) {
		PayStrategy commission = new CommissionEmplyee(10000,.06);
		PayStrategy hourly = new HourlyEmployee(16.75,40);     
		Employee joe = new Employee();
		joe.setPaystrategy(commission);
		System.out.println(joe.earnings());
		joe.setPaystrategy(hourly); 
		System.out.println(joe.earnings());

	}

}
