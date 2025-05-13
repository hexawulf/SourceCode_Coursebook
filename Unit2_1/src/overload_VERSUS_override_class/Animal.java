package overload_VERSUS_override_class;

public class Animal{
	
	public void makeSound(){
		System.out.println("I am an animal and I am making the following sound: \'sound\' haha");
	}
	
	//Overloaded with unique signature
	public void makeSound(String sound){
		System.out.println("I am an animal and I am making the following sound:" + sound +" haha");
	}
	
	//Overloaded with unique signature
	public void makeSound(String sound, int times){
		for(int count = 0; count < times; count++){
			System.out.println("I am an animal and I am making the following sound:" + sound +" haha");
		}
	}
	
	//Overloaded with unique signature 
	public String makeSound(int times){
		String  s = "Tutorial String";
		for(int count = 0; count < times; count++){
			System.out.println("I am an animal and I am making the following sound: TUTORIAL soundhaha");
		}
		return s;
	}
	
//	@Override
//	public String toString(){
//		return "This is an example of overriden toString()-method test 28.04";
//	}
	
	public static void main(String[] args){
		Animal myAnimal = new Animal();
//		myAnimal.makeSound();
//		myAnimal.makeSound("I am an awesome animal");
//		myAnimal.makeSound("I make a sound several times", 2);
//		
//		String methodResponse = myAnimal.makeSound(5);
//		System.out.println("We got back:" + methodResponse);
		
		int hashCodeOfMyAnimal = myAnimal.hashCode();
		System.out.println("hashCodeOfMyAnimal=" + hashCodeOfMyAnimal);
		
		System.out.println(myAnimal.toString());
		
		//As usual --this is your playground and test area
		
	}//main

}//class
