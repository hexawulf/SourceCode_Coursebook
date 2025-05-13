package arrays_02;



public class MainClass_01{

	public static void main(String[] args) {
		
		//Option 1
		int intArray1[];    //declaring array
		intArray1 = new int[3];  // instantiation - allocating memory to array for 3 elements 
		intArray1[0] = 99;//initialization
		intArray1[1] = 88;//initialization
		intArray1[2] = 77;//initialization
		
		//Option 2
		int[] intArray2 = new int[20]; // combining declaration + instantiation
		
		//Option 3
		int[] intArray3 = {11,22,33};//declaration, instantiation and initialization  
		
		System.out.println("intArray2.length=" + intArray2.length);
		
//		int intArray4[] = new int[5];
//		System.out.println("TEST=" + intArray4[0] + "|");
		
		/*
		 * For the students:
		 * Please uncomment some lines and see what happens
		 * 
		 * */

		int[] myArray01; //declaration
		myArray01 = new int[5];//instantiation - memory is reserved
		//make a print here , show what is default 	
		myArray01[0] = 4711;//initialization -memory is filled in with content
		myArray01[1] = 4712;
		myArray01[2] = 4713;
		
		//int[] myArray01 = {1,3,5,6,8}; //declaration + instantiation + initialization 
		
		
//		System.out.println("Element on position 0 is:" + myArray01[0] );
//		System.out.println("Element on position 4 is:" + myArray01[4] );
		//System.out.println("Element on position 5 is:" + myArray01[5] );
		
		for(int number : myArray01){
			System.out.println("Next numer is:" + number);
		}
		
		//System.out.println("myArray01.length=" + myArray01.length );
		
//		for(int index = 0; index < myArray01.length ; index ++){
//			System.out.println("The element at position " + index + " is " + myArray01[index]);
//		}
		
//		int [] row0 = new int[] {1,2,3};
//		int [] row1 = new int[] {4,5,6};
//		int [] row2 = new int[] {7,8,9};
//		int [][] myArray02 = new int[][] {row0,row1,row2};
		
		int [][] myArray02 = {{1,2,3},
							  {4,5,6},
							  {7,8,9}};
		System.out.println(" myArray02.length =" + myArray02.length);
		System.out.println("myArray02[0].length=" + myArray02[0].length);
	
		//What is printed on the console with this for-loop?
//		System.out.println("First for-loop START");
//		for(int row = 0; row < myArray02.length; row++){ // Stop condition !! 
//			int numerOfColumnsInThisRow = myArray02[row].length;
//			//System.out.println("col=" + col);
//			for(int col = 0; col < numerOfColumnsInThisRow; col++){
//				//System.out.println("row=" + row);
//				if(row == numerOfColumnsInThisRow - 1){
//					System.out.println(myArray02[row][col]);
//				}else{
//					System.out.println(myArray02[row][col] + ",");
//				}
//				
//			}//inner for
//			System.out.println("=======");
//		}//outer for
//		System.out.println("First for-loop END");
		
		System.out.println("Second for-loop START");
		for(int row = 0; row < myArray02.length; row++){ // Stop condition !! 
			int numerOfColumnsInThisRow = myArray02[row].length;
			//System.out.println("col=" + col);
			for(int col = 0; col < numerOfColumnsInThisRow; col++){
				//System.out.println("row=" + row);
				if(col == numerOfColumnsInThisRow - 1){
					System.out.print(myArray02[row][col]);
				}else{
					System.out.print(myArray02[row][col] + ",");
				}
				
			}//inner for
			System.out.println();
		}//outer for
		System.out.println("Second for-loop END");
		
		
		
		//As usual --this is your playground and test area
		
		
		
		
		
	}//main
	
	
	
}//class
