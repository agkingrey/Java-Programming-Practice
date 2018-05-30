//Austin Kingrey
public class Polymorphism {
	
	public static void main(String args[]) {
	//Here I'm going to create create my variables and assign them to a class for editing!
		Animal anim = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
	//This for loop is going to help me call my methods by using the super class.	
		Animal[] animals = {dog, cat};
		
		
		
		for (Animal abc: animals){
		abc.show();
		}
	}

}
//here's my superclass! 
class Animal {
	public void show(){
		System.out.print("Animal method");
		
		}
	}
//These subclasses will extend the properties of animals class, causing both to cat and dog to print
class Dog extends Animal {
	public void show() {
		System.out.println("Dog Method");
	}
}

class Cat extends Animal {
	public void show(){
		System.out.println("Cat method");
	}
}