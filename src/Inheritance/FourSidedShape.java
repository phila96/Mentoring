package Inheritance;

//a abstract class can implement inherited methods, create new methods (just the signature or the full method with a body), and create variables 

//to inherit a interface we say the child class implements the interface
public abstract class FourSidedShape implements Shape
{
	public abstract boolean isSquare(); //like interfaces a abstract class can simply declare a method signature
	
	private int sides = 4; //note, this is this classes local variable for sides, the interface has its own static final int sides
	
	//a abstract class that implements a interface can redeclare, redefine, or ignore the defined methods in the interface
	
	//redeclare getArea
	public abstract int getArea();
	
	//redefining getSides
	public int getSides()
	{
		return sides;
	}
	
	//ignoring the other methods, like show()
}
