package overload_VERSUS_override_class;

public class Cat extends Animal{
	
	
	public void makeSond(){
		System.out.println("I am a cat and I am making the following sound: meaow haha");
	}
	
	public static void main(String[] args){
		Cat c = new Cat();
		c.makeSound();
		c.makeSound(" cat sound ");
		c.makeSound(" just another cat sound ", 4);

	}//main

}//class
