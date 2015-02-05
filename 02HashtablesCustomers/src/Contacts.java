import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 
 */

/**
 * @author Yeray García
 *
 */
public class Contacts {
	private String owner;
	private Hashtable<String,Customer> customers;
	
	
	/**
	 * @param owner
	 */
	public Contacts(String owner) {
		this.owner = owner;
		customers = new Hashtable<String,Customer>();
	}
	public void addCustomer (Customer c) {
		customers.put(c.getDni(), c);
		
	}
	
	public Customer searchCustomer(String dni) {
		Customer customer = null;
		customer = customers.get(dni);
		return customer;
		
		
		
		
		
	}
	public void removeCustomer(String dni) {
		customers.remove(dni);
		
	}
	
	public String showAll () {
		String allCustomers = "";
		Enumeration <String> keys = customers.keys();
		while (keys.hasMoreElements()) {
			String dni = keys.nextElement();
			allCustomers = allCustomers + customers.get(dni).toString() + "\n";
			
			
			
		}
		return allCustomers;
				
	}
	

}
