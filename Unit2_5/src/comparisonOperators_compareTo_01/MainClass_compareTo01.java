package comparisonOperators_compareTo_01;

public class MainClass_compareTo01{

	public static void main(String[] args){
//		String str01 = "A";
//		String str02 = "a";
//		
//		int comparisonResult = str01.compareTo(str02);
//		System.out.println("comparisonResult=" + comparisonResult);
//		
//		if(comparisonResult == 0){
//			System.out.println("The Strings are lexicographically equal");
//		}else if(comparisonResult < 0){
//			System.out.println("str01 is lexicographically before str02");
//		}else if(comparisonResult > 0){
//			System.out.println("str02 is lexicographically before str01");
//		}
		
		
		String str03 = "a";
		String str04 = "A";
		
		int comparisonResult_IgnoreCase = str03.compareToIgnoreCase(str04);
		System.out.println("comparisonResult_IgnoreCase=" + comparisonResult_IgnoreCase);
		
		if(comparisonResult_IgnoreCase == 0){
			System.out.println("The Strings are lexicographically equal");
		}else if(comparisonResult_IgnoreCase < 0){
			System.out.println("str03 is lexicographically before str04");
		}else if(comparisonResult_IgnoreCase > 0){
			System.out.println("str04 is lexicographically before str03");
		}
	}//main

}//class
