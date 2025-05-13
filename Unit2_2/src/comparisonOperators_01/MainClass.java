package comparisonOperators_01;

public class MainClass {

	public static void main(String[] args) {
		ShoppingBasket w1 = new ShoppingBasket(2, 126.98d, true);
		ShoppingBasket w2 = new ShoppingBasket(5, 754.97d, false);
		ShoppingBasket w3 = new ShoppingBasket(5, 754.97d, false);
		ShoppingBasket w4 = w3;//w4 refers to the same area of the memory where w3 is stored.
		/*
		 * In other word the physical location in the memory where the values (5, 754.97d, false) are stored,
		 * has two references 'pointing' to it: w3 and w4
		 */
		
		/* With the '=='-operator the objects are compared in terms of their identity, 
		 * not their content*/
		System.out.println("Comparison w1 == w2 is evaluated to :" + (w1 == w2));
		System.out.println("Comparison w2 == w3 is evaluated to :" + (w2 == w3));
		System.out.println("Comparison w3 == w4 is evaluated to :" + (w3 == w4));
		System.out.println("Comparison w2 == w4 is evaluated to :" + (w2 == w4));
		
		
		System.out.println("\n This is the start of the play area");
		/*
		 * Since w3 and w4 refer(point) to the same object, every change to w3 will also change w4, 
		 * and every change of w4 will change w3.
		 * Here are some examples of this behavior
		 */
		w3.setNumberProducts(18);
		System.out.println("Printing w3:" + w3.toString());
		System.out.println("Printing w4:" + w4.toString());
		
		w4.setNumberProducts(9);
		System.out.println("Printing w4:" + w4.toString());
		System.out.println("Printing w3:" + w3.toString());
		
		/*Questions for the students:
		 * 1.How can you make w4 NOT to refer to w3?
		 * In other words: the values contained in the object w3 to be the same as the values contained in w4
		 * but the  (w3 == w4)-comparison to return false?*/
		System.out.println("Comparison w3 == w4 is evaluated to :" + (w3 == w4));//make this to return false 
		
		//As usual --this is your playground and test area
		
		
		
		
	}//main

}
