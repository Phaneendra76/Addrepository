package Class_Period;

//implementation of abstraction through abstract class 
abstract class Animal {

	void eat() 
	{
		System.out.println("The animal is eating.");
	}

	Animal() 
	{
		System.out.println("An Animal is going to be created.");
	}

	abstract void walk();
}

class Cow extends Animal 
{
	Cow()
	{
		System.out.println("You have created a Cow");
	}

	void walk()
	{
		System.out.println("Cow is walking.");
	}

}

class Goat extends Animal
{
	Goat() 
	{
		System.out.println("You have created a Goat");
	}

	void walk()
	{
		System.out.println("Goat is walking.");
	}
}

public class Demo_student2 {
	public static void main(String args[]) {
		Cow Goat = new Cow();

		Goat goat = new Goat();
		goat.walk();
		goat.eat();
	}
}
