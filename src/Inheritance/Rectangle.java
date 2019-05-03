package Inheritance;

//to inherit a abstract class we say the child class extends the parent class
public class Rectangle extends FourSidedShape
{

	private int length;
	private int width;
	
	Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	Rectangle(int x, int y)
	{
		length = x;
		width = y;
	}
	
	//since Rectangle is not abstract it must implement (override) all the inherited methods that FourSidedShape did not implement,
	@Override
	public int getPerimeter() {
		return (2 * (length + width));
	}

	@Override
	public boolean isSquare() {
		return false;
	}

	@Override
	public int getArea() {
		return (length * width);
	}

}
