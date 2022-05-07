package compo;

public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	PayStrategy paystrategy;
	
	public PayStrategy getPaystrategy() {
		return paystrategy;
	}
	public void setPaystrategy(PayStrategy paystrategy) {
		this.paystrategy = paystrategy;
	}
	
	public Employee()
	{
		
	}
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	} 
	public double earnings()
	{
		return paystrategy.earnings();
	}
	public String toString() {
		return	"firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber;
	}
}
