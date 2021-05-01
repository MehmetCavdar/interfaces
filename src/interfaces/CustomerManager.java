package interfaces;

public class CustomerManager {
	
	
	private Logger[] loggers; 
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M�steri Eklendi "+ customer.getFirstName());
		

		Utils.Runloggers(loggers, customer.getFirstName()); //Dikkat Sinif isminden cagiriyoruz (b�y�k harf)

	}
	
	public void delete(Customer customer) {
		System.out.println("M�steri Silindi "+ customer.getFirstName());

		Utils.Runloggers(loggers, customer.getFirstName()); //Dikkat Sinif isminden cagiriyoruz (b�y�k harf)
	}

}
