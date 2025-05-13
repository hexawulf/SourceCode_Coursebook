package calendar_01;

public class MainClass02{

	public static void main(String[] args){
		int num = 8374;
		int sumOfDigits = 0;//neutral element for addition is zero, neutral element for multiplication is one 
		int remainder = 0;
		while(true){
			remainder = num % 10;
			sumOfDigits = sumOfDigits + remainder;
			num = num / 10;
			System.out.println("######################################################");
			System.out.println("current remainder =" + remainder);
			System.out.println("current sumOfDigits =" + sumOfDigits);
			System.out.println("current num =" + num);
			System.out.println("######################################################");
			if(num == 0) {
				break;
			}
		}
		System.out.println("sumOfDigits=" + sumOfDigits);

	}//main
}//class
