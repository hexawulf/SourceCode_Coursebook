package stacks_01;

import java.util.Scanner;

public class OnlineShop{
	private History history = new History();
	private String[] steps = new String[] {"Show shopping cart" , "Choose payment method" , 
											"Enter payment information" , "Choose shipping method" ,
											"Show order overview" , "Show order confirmation"};
	
	public static void main(String[] args){
		OnlineShop shop = new OnlineShop();
		shop.orderProcess();
		
		//As usual --this is your playground and test area
		//Of course now the code is bigger and more complex, so you can also make changes to other parts of the program in order to make it work

	}//main
	
	private void orderProcess(){
		Scanner s = new Scanner(System.in);
		int processPosition = 0;
		int input = -1;
		
		while(input != 0){
			System.out.println("Current step is:" + steps[processPosition]);
			System.out.println("Please choose (1=next to '" + steps[processPosition + 1] + "' , 2=back, 0=exit");
			
			input = s.nextInt();
			
			switch(input){
				case 0:
				{
					System.out.println("Thank you for your visit");
					break;
				}
				case 1:
				{
					processPosition++;
					history.next(steps[processPosition]);
					if(processPosition == steps.length - 1){
						System.out.println("Thank you for purchasing");
						return;
					}
					break;
				}
				case 2:
				{
					if(history.back() != null)
						processPosition --;
					break;
				}
				
			}
		}//while
		
		//Make some more tests, or include them in the main method? - Your choice
		
	}//orderProcess
	
	
	
}//class
