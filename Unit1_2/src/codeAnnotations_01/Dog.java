package codeAnnotations_01;

public class Dog extends Animal{
	
	@Override
	public void makeSound(String sound) {//Exchange something in the string here in order to understand how the @Override works
		System.out.println("I am a dog and I am making the following sound:" + sound);
	}
	
	@Override
	public void makeSound(String sound, int times) {
		for(int i = 0; i < times ; i ++){//Exchange something in the string here in order to understand how the @Override works
			System.out.println("I am a dog and I am making the following sound:" + sound + " for " + i + "-th time");
		}
		
	}
}
