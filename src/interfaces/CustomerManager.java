package interfaces;

public class CustomerManager {
	
	
	private Logger[] loggers; 
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müsteri Eklendi "+ customer.getFirstName());
		

		Utils.Runloggers(loggers, customer.getFirstName()); //Dikkat Sinif isminden cagiriyoruz (büyük harf)

	}
	
	public void delete(Customer customer) {
		System.out.println("Müsteri Silindi "+ customer.getFirstName());

		Utils.Runloggers(loggers, customer.getFirstName()); //Dikkat Sinif isminden cagiriyoruz (büyük harf)
	}

}
