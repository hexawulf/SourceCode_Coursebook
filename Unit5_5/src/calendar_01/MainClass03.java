package calendar_01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainClass03{

	public static void main(String[] args){
		//Rolling forward single attributes of a GregorianCalendar
		System.out.println("Rolling forward single attributes of a GregorianCalendar START \n");
		GregorianCalendar dateLastpasswordChange = new GregorianCalendar();
		Date now = dateLastpasswordChange.getTime();
		System.out.println("Before rolling dateLastpasswordChange=> now=" + now);
		
		//############################# Algorithm for the rolling ####################################
		int monthsToRollForward = -22; //try to break the logic by changing this number 
		int yearsToBeRolledForward = 0; //initialize with zero
		//Step 1: Get the current month
		int currentMonth = dateLastpasswordChange.get(Calendar.MONTH);
		System.out.println("currentMonth=" + currentMonth);
		
		//Step 2: Add (totalAmountOfMonths + currentMonth) 
		int totalAmountOfMonths = currentMonth + monthsToRollForward;
		System.out.println("totalAmountOfMonths=" + totalAmountOfMonths);
		
		//Step 3: Calculate the index of the target month
		int monthWhichWeHaveReached = totalAmountOfMonths % 12;
		/*We use the number 12, 
		 * because 
		 * --the number 11 refers only to the index of the month in the year for the method roll,
		 * but NOT for the calculation!!
		 * For the calculation the real amount of months in a year must be considered.
		 * This is the number 12 -there are 12 months in the year
		 * 
		 * --the indexing of the months starts from ZERO
		 * Example calculation:
		 * now is October, this month has value 9
		 * rolling forward six(6) months must result in April, which has value 3
		 * Calculating (9+6) = 15 
		 * How to get to value 3? 
		 * We have to do (15 % 12)
		 * This is why the division and the modulo is taking the number 12, and not 11
		 * Please read and try to understand this justification, this is the core of the understanding for algorithm for rolling a date.
		 * */
		System.out.println("monthWhichWeHaveReached=" + monthWhichWeHaveReached);
		//monthWhichWeHaveReached - this is just FYI -to see if the algorithm is correct
		//when rolling backward the modulo operator cannot deliver us the correct month. Think about "why"? The reason is logical, not mathematical 
		
		//Step 4: Calculate the target year  
		yearsToBeRolledForward = totalAmountOfMonths / 12;
		System.out.println("Calculated yearsToBeRolledForward=" + yearsToBeRolledForward);	
		
		/*If we are rolling back we need to adjust the yearsToBeRolledForward
		 *Think about it logically: 
		 *
		 *1. currentMonth is always a positive number
		 *
		 *2.If we are rolling back monthsToRollForward is a negative number
		 *totalAmountOfMonths = currentMonth + monthsToRollForward;
		 *==> this calculation does not deliver the correct result 
		 *As a consequence:
		 *yearsToBeRolledForward = totalAmountOfMonths / 12;
		 *==> does not deliver the correct result
		 *
		 *There are different ways of "fixing" the calculation of yearsToBeRolledForward
		 *This is my way.
		 *You can also try to implement different ways, for example by recalculating the totalAmountOfMonths in a different way :) 
		 **/
		if(monthWhichWeHaveReached < 0){
			System.out.println("We are rolling back !! BEFORE adjustment yearsToBeRolledForward=" + yearsToBeRolledForward);
			yearsToBeRolledForward = yearsToBeRolledForward - 1;
			System.out.println("We are rolling back !! AFTER adjustment yearsToBeRolledForward=" + yearsToBeRolledForward);
		}
		
		//Step 5: Do the rolling
		dateLastpasswordChange.roll(Calendar.MONTH, monthsToRollForward);
		dateLastpasswordChange.roll(Calendar.YEAR, yearsToBeRolledForward);
		
		//Step 6: 
		Date correctlyRolledDate = dateLastpasswordChange.getTime();
		System.out.println("After rolling the correctlyRolledDate=" + correctlyRolledDate);
	}//main

}//class
