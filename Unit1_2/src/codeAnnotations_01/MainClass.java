package codeAnnotations_01;

public class MainClass {

	
	
	public static void main(String[] args) {
		Animal fox01 = new Animal();
		Animal cat01 = new Cat();
		Dog dog01 = new Dog();
		
		/*Questions for students: 
		 * 1.Why is there a warning on this line?
		 * 2.How can we tell the compiler to ignore this warning?
		 * */
		fox01.makeSound();
		fox01.makeSound(3);
		fox01.makeSound("Not a fox sound");
		fox01.makeSound("Hihihi fox" , 2);
		
		cat01.makeSound();
		cat01.makeSound(3);
		cat01.makeSound("Not a cat sound");
		cat01.makeSound("hissss hissss" , 2);
		
		dog01.makeSound();
		dog01.makeSound(3);
		dog01.makeSound("Not a dog sound");
		dog01.makeSound("Grrrrr grrrr grrrr" , 4);
		
		//As usual here is your play -area -create objects, call some of their methods. try different things		
		
	}//main

}
