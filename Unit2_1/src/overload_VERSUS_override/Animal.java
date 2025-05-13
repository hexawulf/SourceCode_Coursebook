package overload_VERSUS_override;

public class Animal{
	public void makeSound() {
		System.out.println("I am an animal and I am making the following sound: \'sound\' haha");
	}
	
	//Overloaded unique signature
	public void makeSound(String sound) {
		System.out.println("I am an animal and I am making the following sound:" + sound);
	}
	
	//Overloaded unique signature
	public void makeSound(int times) {
		for(int i = 1; i <= times ; i ++){
			System.out.println("I am an animal and I am making the following sound: \'sound\' for " + i + "-th time");
		}
		
	}
	
	//Overloaded unique signature
	public void makeSound(String sound, int times) {
		for(int i = 0; i < times ; i ++){
			System.out.println("I am an animal and I am making the following sound:" + sound + " for " + i + "-th time");
		}
		
	}
	
	public static void main(String[] args){
		Animal myAnimal_01 = new Animal();
		myAnimal_01.makeSound();
		myAnimal_01.makeSound("Animal sound test01");
		myAnimal_01.makeSound(4);
		myAnimal_01.makeSound("Repeated animal sound", 2);
		
		
		//As usual --this is your playground and test area
		
		
		
		
	}//main
}//class
