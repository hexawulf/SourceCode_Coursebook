package codeAnnotations_01;

/*This is a class-comment*/
public class Cat extends Animal{
	
	@Override
	public void makeSound() {//Exchange something is the string here in order to understand how the @Override works
		System.out.println("I am a cat and I am making the following sound: meaow");
	}
	
	/*This is a multi-line comment
	 * Test how the @Override works:
	 * 1.Add one letter to the method name:public void makeSounds 
	 * Is there an error?
	 * 2.Now delete the @Override. Is there an error now?
	 * 3.Return the method declaration to: public void makeSound(int times)  and add the @Override again
	 * Now change the type of the variable 'times', make it double times
	 * Is there an error? 
	 * 4.Delete the @Override. Is there an error now? 
	 */
	@Override
	public void makeSound(int times) {
		for(int i = 0; i < times ; i ++){//Exchange something is the string here in order to understand how the @Override works
			System.out.println("test I am a cat and I am making the following sound: meaow for " + i + "-th time");
		}	
	}
	
}
