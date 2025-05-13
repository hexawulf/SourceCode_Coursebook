package codeAnnotations_01;

/*This is a class comment
 * 
 * This class is the super-class which each animal-type will extend 
 * It contains four overloaded methods,called makeSound 
 * 
 * Each class extended from the class Animal
 * will be able to implement its own version of the method makeSound
 * By using the annotation @Override the extended class can guarantee 
 * that the compiler will check if the method declared with @Override 
 * is actually overriding a method of the super-class
 */
public class Animal {
	
	/**
	 * @author Andy TEST 
	 * @param NONE
	 * @deprecated Since it is not defining what sound the animal should make, <br>
	 * this method is deprecated and should not be used in future versions*/
	@Deprecated //pay attention @Deprecated is an annotation, whereas @deprecated is javadoc-tag
	public void makeSound() {
		System.out.println("I am an animal and I am making the following sound: \'sound\' haha");
	}
	
	public void makeSound(String sound) {
		System.out.println("I am an animal and I am making the following sound:" + sound);
	}
		
	//this method is overridden in the class Cat
	public void makeSound(int times) {
		for(int i = 0; i < times ; i ++){
			System.out.println("I am an animal and I am making the following sound: \'sound\' for " + i + "-th time");
		}		
	}
	
	public void makeSound(String sound, int times) {
		for(int i = 0; i < times ; i ++){
			System.out.println("I am an animal and I am making the following sound:" + sound + " for " + i + "-th time");
		}
		
	}
	
	//this method is NOT implemented in the class Cat
	public void moveForward(){
		System.out.println("Animal is moving forward");
	}
	
	
	
}
