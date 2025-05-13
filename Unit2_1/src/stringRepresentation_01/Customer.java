package stringRepresentation_01;

public class Customer {

//	private String firstName;
//	private String name;
//	private String sex;
//	private String birthdate;
	
	public String firstName;
	public String name;
	public String sex;
	public String birthdate;
	
	public Customer(String firstName, String name, String sex, String birthdate){
		this.firstName = firstName;
		this.name = name;
		this.sex = sex ;
		this.birthdate = birthdate;
	}
	
	
	/* In order to guarantee that we did not forget any of the attributes in the toString method,
	 * go up to the list of attributes and click each of them to get it highlighted
	 * The editor will then show you all occurrences of the corresponding string in the file*/
	@Override
	public String toString(){
		return "Customer object contains following data: " + "\n" +
				"First name:" + this.firstName + "\n" +
				"Name:"  + this.name + "\n" +
				"Sex:" + this.sex + "\n"+
				"Birthdate:" + this.birthdate;
		//would you like to have a different String-representation on the console? 
		//Make your wishes come true here :) 
	}
	
	
}
