package Inheritance;

//the runner class
public class Main 
{
	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		Rectangle rectangle2 = new Rectangle(3, 5);
		Square square2 = new Square(3);
		
		
		System.out.println(rectangle.isSquare()); //as expected the Objects call their respective isSquare method
		System.out.println(square.isSquare());
		System.out.println();
		
		System.out.println(rectangle2.getPerimeter()); 
		System.out.println(rectangle2.getArea());
		System.out.println(square2.getPerimeter()); //since Square does not have a getArea or getPerimeter method it uses the parents (Rectangle)
		System.out.println(square2.getArea());
		System.out.println();
		
		
		//these are things a interface "should not" do, like having a method body
		Shape.show(); //calling a static method on a interface class
		System.out.println(square.getSides()); //it shows 4 because getSides was overridden by FourSidedShape to show the local variable sides in that class
		System.out.println(square.getInterfaceSides()); //it shows 0 because getInterfaceSides was never overridden, and it shows the value for the local variable sides in shape
	}
}
