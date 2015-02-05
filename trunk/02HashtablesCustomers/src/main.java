/**
 * 
 */

/**
 * @author Yeray
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contacts contact = new Contacts("YERAY");
		Customer myCustomer = new Customer("3343","hola","aaa@gmail.com");
		contact.addCustomer(myCustomer);
		System.out.println("Contact:" + contact.showAll());
		

				

	}

	
}
