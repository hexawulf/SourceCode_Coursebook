package stringRepresentation_01;

public class MainClass {

	public static void main(String[] args) {
		Object myObject_01 =  new Customer("Ralf" , "Hermann" , "m" , "15.05.1978");
		//Customer myObject_01 =  new Customer("Ralf" , "Hermann" , "m" , "15.05.1978");
		System.out.println("Explicit:\n" + myObject_01.toString());//explicit call of the toString()-method
		System.out.println("\n\n=================================================================");
		System.out.println("Implicit:\n" + myObject_01);//implicit call of the toString() method 
		
		
		//As usual --this is your playground and test area
		
	}//main
	
}//class
