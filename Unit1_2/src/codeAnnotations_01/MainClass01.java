package codeAnnotations_01;

public class MainClass01{

	public static void main(String[] args){
		Cat cat02 = new Cat();
		
		cat02.makeSound();//implemented in the class Cat
		cat02.makeSound(2);//implemented in the class Cat
		cat02.makeSound("New cat sound");//implemented in the class Animal

	}//main

}//class
