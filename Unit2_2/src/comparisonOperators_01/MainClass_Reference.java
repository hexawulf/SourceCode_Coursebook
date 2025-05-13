package comparisonOperators_01;

public class MainClass_Reference{

	public static void main(String[] args){
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str33 = str2;
		
		if (str1 == str2) {
		  System.out.println("str1 has the SAME reference as str2");
		}
		else {
		  System.out.println("str1 has DIFFERENT reference than str2");
		}
		
//		if (str33 == str2) {
//		  System.out.println("str33 has the SAME reference as str2");
//		}
//		else {
//		  System.out.println("str33 has DIFFERENT reference than  str2");
//		}
		
		if(str1.equals(str2)){
			 System.out.println("str1 has the SAME content as str2");
		}else {
			 System.out.println("str1 has DIFFERENT content than str2");
		}
	}//main

}//class
