package Inheritance;

//to inherit a parent class we say the child class extends the parent class
public class Square extends Rectangle
{
	
	Square()
	{
		super(); //so child can use the constructor of the parent (Rectangle)
	}
	
	Square(int x)
	{
		super(x, x); //so child can use the constructor of the parent (Rectangle)
	}
	
	//since a Square is different from a Rectangle we want it to override a method of Rectangle
	@Override
	public boolean isSquare() {
		return true;
	}

}