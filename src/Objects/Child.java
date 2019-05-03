package Objects;

//the child class extends (from) the parent class
public class Child extends Parent{
	
	Child()
	{
		super(); //this calls the constructor for Parent, initializing "name" and "encapsulated" for child
		name = "child";
	}
	
	public void childOnlyMethod()
	{
		System.out.println("only for child!");
	}
	
	
	public void polyMethod()
	{
		System.out.println("this is the Child class version");
	}
	
	
	//note the static keyword, this allows the method call to be resolved at compile time
	public static void type()
	{
		System.out.println("child class");
	}
	
}
