package comparisonOperators_compareTo_01;

public class Customer_Test_compareTo01 implements Comparable{
	private int customerNumber;
	private String firstName;
	private String name;
	private String sex;
	private String birthdate;
	private int age;
	
	public Customer_Test_compareTo01(String firstName, String name, String sex, String birthdate){
		this.firstName = firstName;
		this.name = name;
		this.sex = sex ;
		this.birthdate = birthdate;
	}
	
	//Using lexicographical comparison
	@Override
	public int compareTo(Object obj) {
		Customer_Test_compareTo01 c = null;
		try{
			 c = (Customer_Test_compareTo01) obj;
		}catch(ClassCastException exc){
			System.out.println("ClassCastException was thrown!!");
			System.out.println("exc.getLocalizedMessage=" + exc.getLocalizedMessage());
			return 999;//developer decides what this value should be
		}
			
		if(this.name.equals(c.name)) {
			//if names are equal, compare first names
			return this.firstName.compareToIgnoreCase(c.firstName);
		}else{ 
			//names are not equal, compare them
			return this.name.compareToIgnoreCase(c.name);
		}
	}//compareTo
	
	public static void main(String[] args){
		Customer_Test_compareTo01 cust01 =  new Customer_Test_compareTo01("A", "C", "Male","01.Jan.1991");
		Customer_Test_compareTo01 cust02 =  new Customer_Test_compareTo01("b", "C", "Male","01.Feb.1991");
		
		int comparisonResult = cust01.compareTo(cust02);
		int comparisonResult_oppositeDirection = cust02.compareTo(cust01);
		
		System.out.println("cust01.compareTo(cust02)=" + comparisonResult);
		System.out.println("cust02.compareTo(cust01)=" + comparisonResult_oppositeDirection);
		
		if(comparisonResult < 0){
			System.out.println("cust01 is smaller than cust02, i.e. cust01 is before cust02 in the alphabet");
		}else if(comparisonResult > 0){
			System.out.println("cust02 is smaller than cust01, i.e. cust02 is before cust01 in the alphabet");
		}else{
			System.out.println("The customers are equal");
		}
	}//main

	
}//class
