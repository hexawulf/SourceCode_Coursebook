package working_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import working_01.Customer;

public class CustomerAdministration {
	
	private Collection<Customer> customer;//Only declaration, no memory reserved at this time
	private CustomerStorage customerStorage;
	
	public CustomerAdministration(){
		//(only) instantiating the array customer with capacity of 42 customers 
//		customer = new Customer[42];
//		System.out.println(customer[0]);
//		System.out.println(customer[41]);
		//System.out.println(customer[42]); //why is there an error here? 
		
		//instantiation combined with initialization
		//customer = new ArrayList<Customer>();//instantiation can be omitted 
		this.customer = new ArrayList<Customer>(); 
		customer.add(new Customer("Ulf", "Koll"));
		customer.add(new Customer("Ilse", "Stahl"));
		customer.add(new Customer("Rita", "Kafka"));
		//initialization CAN be done later, or on its own. It is not necessary to do it with the instantiation
		//Since all Collections are dynamic types, we dont need to specify size now 
		
//		for(Customer c : customer){
//			System.out.println(c);
//		}
		
		customerStorage =  new CustomerStorage();
	}//constructor
	
	public void updateAllCustomers(){
	
	}//updateAllCustomers
	
	public void removeAllCustomer(Collection<Customer> c){
		Customer k = null;
		Iterator<Customer> it = c.iterator();
		while(it.hasNext()){
			k = it.next();
			if((k.getSex() == null) || k.getSex().equals("")){
				it.remove();
				System.out.println("Removing customer First Name=" + k.getFirstName() + " Last Name =" + k.getName());
				System.out.println("An element was removed from the collection");
			}
		}
	}//removeAllCustomer
	
	public void printCollectionContent(Collection<Customer> c){
		System.out.println("\nStart of the method printCollectionContent");
		for(Customer k : c){
			System.out.println(k.toString());
		}
		System.out.println("End of the method printCollectionContent\n");
	}//printCollectionContent
	
	public static void main(String[] args) {		
		CustomerAdministration customerAdministration = new CustomerAdministration();
		Collection<Customer> collectionTest = customerAdministration.customer;//creates a shallow copy!!!
		customerAdministration.printCollectionContent(collectionTest);
		customerAdministration.removeAllCustomer(collectionTest);
		customerAdministration.printCollectionContent(collectionTest);
		System.out.println("Original customerAdministration.customer is now also empty :( \n");
		customerAdministration.printCollectionContent(customerAdministration.customer);
		
		//As usual --this is your playground and test area
		
		
		
		
	}//main
	
	

}//class
