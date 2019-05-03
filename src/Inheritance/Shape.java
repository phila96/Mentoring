package Inheritance;

//Technically interfaces are not inherited, they are implemented. But I felt they are still a part of inheritance
//a interface can only declare constant variables (that are assumed static and final) and method signatures
public interface Shape 
{
	int sides = 0;
	
	int getArea(); //method signatures
	int getPerimeter();
	
	//it should be noted though that as of Java 8 interface methods may have bodies (which really blurs the line between interface vs abstraction vs inheritance), 
	//and is why I will say interfaces are a type of inheritance. But the main difference is you can only extend one abstract class but implement as many interfaces as wanted in a class.
	default int getSides()
	{
		return sides;
	}
	
	default int getInterfaceSides()
	{
		return sides;
	}
	
	static void show()
	{
		System.out.println("i'm a method body in a interface");
	}
}
