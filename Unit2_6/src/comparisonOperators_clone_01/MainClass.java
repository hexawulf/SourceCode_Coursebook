package comparisonOperators_clone_01;

import comparisonOperators_clone_01.Customer;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * For the students:
		 * Please make sure you understand these examples very well.
		 * It is very important for your future work to know the difference between deep-copy and shallow-copy
		 * */
		
		
		Customer cust01 =  new Customer("Paul", "Walker", "Male","01.Jan.1991");
		Customer cust02 =  new Customer("Jane", "Stone", "Male","01.Feb.1991");
		
		Address addr01 = new Address(45468, "Muelheim", "Ulrichstrasse", 2);
		Address addr02 = new Address(45468, "Muelheim", "Ulrichstrasse", 2);
		
		cust01.setAddress(addr01);
		cust02.setAddress(addr02);
		
//		System.out.println("\ncust01=\n" + cust01.toString());
//		System.out.println("\ncust02=\n" + cust02.toString());
		
		Customer cust03 = cust02;
		//System.out.println("\ncust03=\n" + cust03.toString());
		
		cust03.setBirthdate("01.Jan.2000");
//		System.out.println("\ncust02=\n" + cust02.toString());
//		System.out.println("\ncust03=\n" + cust03.toString());
		
		/*------------------------------------------------------------------------------------*/
		Customer cust04 = (Customer)cust03.clone();//creates a shallow copy, exchange implementation -deep copy
		
		cust04.setBirthdate("12.April.1995");
		System.out.println("\ncust02=\n" + cust02.toString());//Is cust02.birthday affected? 
		System.out.println("\ncust03=\n" + cust03.toString());//Is cust03.birthday affected? 
		System.out.println("\ncust04=\n" + cust04.toString());
		
		cust04.getAddress().setHouseNumber(99);//
		System.out.println("###################################################");
		System.out.println("After chnaging the address");
		System.out.println("\ncust02=\n" + cust02.toString());//
		System.out.println("\ncust03=\n" + cust03.toString());
		System.out.println("\ncust04=\n" + cust04.toString());
		
	}//main

}//class
