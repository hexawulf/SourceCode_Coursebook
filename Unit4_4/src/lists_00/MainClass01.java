package lists_00;

import java.util.ArrayList;

public class MainClass01{

	public static void main(String[] args){
		ArrayList<Integer> myArrayList01 = new ArrayList<Integer>(); 
		myArrayList01.add(11);
		myArrayList01.add(22);
		myArrayList01.add(33);
		myArrayList01.add(44);
		myArrayList01.add(55);
		myArrayList01.add(66);
		//myArrayList01.
		
		System.out.println("Printing myArrayList01");
		for(int currentElementInTheArrayList : myArrayList01 ){
			System.out.println("currentElementInTheArrayList=" + currentElementInTheArrayList);
		}
		System.out.println("\n\n");
		
		/*Testing the remove()-method*/
		int removedNumber = myArrayList01.remove(3);
		System.out.println("removedNumber=" + removedNumber);
		System.out.println("Printing myArrayList01");
		for(int currentElementInTheArrayList : myArrayList01 ){
			System.out.println("currentElementInTheArrayList=" + currentElementInTheArrayList);
		}
		System.out.println("\n\n");
		
		/*Testing the get()-method*/
		int elementAtIndex3 = myArrayList01.get(3);
		System.out.println("elementAtIndex3=" + elementAtIndex3);
		
		/*Testing the add()-method*/
		System.out.println("Adding the nummer 999 at index 3");
		myArrayList01.add(3,999);
		System.out.println("Printing myArrayList01");
		for(int currentElementInTheArrayList : myArrayList01 ){
			System.out.println("currentElementInTheArrayList=" + currentElementInTheArrayList);
		}
		System.out.println("\n\n");
		
		/*Testing the set()-method*/
		int elementRemovedFromIndex4 = myArrayList01.set(4,8888);
		System.out.println("elementRemovedFromIndex4=" + elementRemovedFromIndex4);
		System.out.println("Printing myArrayList01");
		for(int currentElementInTheArrayList : myArrayList01 ){
			System.out.println("currentElementInTheArrayList=" + currentElementInTheArrayList);
		}
		System.out.println("\n\n");
	}//main

}//class
