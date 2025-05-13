package interactiveLecture;

/**
 * Class <code>Employee</code> defining an Employee object
 * represented by name, and social security   number
 * @author user
 * @version 1.0
 */
public abstract class Employee{
	
	//attributes 
	private final String name;
	private final String socialSecurityNumber;

	
	/**
	 * Constructor: creates an Employee object
	 * @param name the name of the Employee
	 * @param ssn the social security number of 	the Employee
	 */
	public Employee(String name, String ssn) {
      this.name = name;                                    
      this.socialSecurityNumber = ssn;         
	} 
   
   /**
	* Returns the name of the Employee
	* @return name
	*/
	public String getName() { return name;  } 
	
	/**
	* Returns the social security number
	* @return socialSecurityNumber
	*/
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	} 
	
	/**
	* Returns a string representation of an  Employee object
	* @return name, social security number
	*/ 
	@Override
	public String toString()  {
		return String.format("%s%s%n",getName(),getSocialSecurityNumber());
	} 
}//class
