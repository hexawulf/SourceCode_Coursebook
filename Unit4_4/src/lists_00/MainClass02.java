package lists_00;


import java.util.LinkedList;

public class MainClass02{

	public static void main(String[] args){
		LinkedList<Integer> myLinkedList01 = new LinkedList<Integer>(); 
		myLinkedList01.add(11);
		myLinkedList01.add(22);
		myLinkedList01.add(33);
		myLinkedList01.add(44);
		myLinkedList01.add(55);
		myLinkedList01.add(66);
		
		System.out.println("Printing myLinkedList01");
		for(int currentElementInTheLinkedList : myLinkedList01 ){
			System.out.println("currentElementInTheLinkedList=" + currentElementInTheLinkedList);
		}
		System.out.println("\n\n");

		/*Testing the remove()-method*/
		int removedNumber = myLinkedList01.remove(3);
		System.out.println("removedNumber=" + removedNumber);
		System.out.println("Printing myLinkedList01");
		for(int currentElementInTheLinkedList : myLinkedList01 ){
			System.out.println("currentElementInTheLinkedList=" + currentElementInTheLinkedList);
		}
		System.out.println("\n\n");
		
		/*Testing the get()-method*/
		int elementAtIndex3 = myLinkedList01.get(3);
		System.out.println("elementAtIndex3=" + elementAtIndex3);
		
		/*Testing the add()-method*/
		System.out.println("Adding the nummer 999 at index 3");
		myLinkedList01.add(3,999);
		System.out.println("Printing myLinkedList01");
		for(int currentElementInTheLinkedList : myLinkedList01 ){
			System.out.println("currentElementInTheLinkedList=" + currentElementInTheLinkedList);
		}
		System.out.println("\n\n");
		
		/*Testing the set()-method*/
		int elementRemovedFromIndex4 = myLinkedList01.set(4,8888);
		System.out.println("elementRemovedFromIndex4=" + elementRemovedFromIndex4);
		System.out.println("Printing myLinkedList01");
		for(int currentElementInTheLinkedList : myLinkedList01 ){
			System.out.println("currentElementInTheLinkedList=" + currentElementInTheLinkedList);
		}
		System.out.println("\n\n");
	}//main

}//class
