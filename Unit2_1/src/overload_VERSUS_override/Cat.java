package overload_VERSUS_override;

public class Cat extends Animal{
	
	
	//yes, i am overriding this, look at me.... uncomment next line to produce effect
	//@Override
	public void makeSond() {
		System.out.println("I am a cat and I am making a special sound: \'sound\' VERY SPECIAL");
	}
	
	//Overloaded unique signature
	@Override
	public void makeSound(String sound) {
		System.out.println("I am a cat and I am making the following sound:" + sound);
	}
	
	//Overloaded unique signature
	@Override
	public void makeSound(int times) {
		for(int i = 0; i < times ; i ++){
			System.out.println("I am a cat and I am making the following sound: \'sound\' for " + i + "-th time");
		}
		
	}
	
	//Overloaded unique signature
	@Override
	public void makeSound(String sound, int times) {
		for(int i = 0; i < times ; i ++){
			System.out.println("I am a cat and I am making the following sound:" + sound + " for " + i + "-th time");
		}		
	}

	
	
	
	public static void main(String[] args){

		
		Cat myCat_01 = new Cat();
		myCat_01.makeSond();
		myCat_01.makeSound("Cat sound test 0123");
		myCat_01.makeSound(3);
		myCat_01.makeSound("Another cat sound", 5);
		
		
		System.out.println("Without overriding the toString()-method    c.toString()=" + myCat_01.toString());
		System.out.println("The hashCode of the cat is=" + myCat_01.hashCode());//page 28 from the script 
		//why different hashes? hex to decimal 
	}//main

}
