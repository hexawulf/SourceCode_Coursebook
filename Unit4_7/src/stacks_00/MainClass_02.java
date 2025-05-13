package stacks_00;

import java.util.Scanner;

public class MainClass_02{

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Simple menu:");
		System.out.println("1. Enter new word");
		System.out.println("2. Show last entered word");
		System.out.println("3. Exit program");
		System.out.println("Please enter your choice: ");
		
		int choice = -1;
		
		while(choice != 3){
			if(myScanner.hasNextInt()){
				choice = myScanner.nextInt();
			}else{
				System.out.println("You have entered non integer value");
				myScanner.reset();
				myScanner.next();
			}
			
			//System.out.println("Your choice is: " + choice);
			
			switch(choice){
				case 1: {
					System.out.println("You have entered choice=1");
					break;
				}//case 1
				case 2: {
					System.out.println("You have entered choice=2");
					break;
				}//case 2
				case 3: {
					System.out.println("You have entered choice=3");
					System.out.println("Bye bye");
					break;
				}//case 3
				default:{
					System.out.println("Unknown choice");
					break;
				}//default			
			}//switch
			
			if(choice == 3){
				break;//this is breaking the while-loop
			}
			
			System.out.println();
			System.out.println("1. Enter new word");
			System.out.println("2. Show last entered word");
			System.out.println("3. Exit program");
			System.out.println("Please enter your choice: ");
		}//while
	}//main
}//class
