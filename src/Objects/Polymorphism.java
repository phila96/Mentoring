package Objects;

//This class shows the power of runtime polymorphism
public class Polymorphism 
{
	public static void main(String[] args) 
	{
		Parent parent = new Parent();
		Child child = new Child();
		Parent poly = new Child(); //due to runtime polymorphism the Parent can be initialized as a Child and act like a Child object
		
		
		System.out.println(parent.getName());
		System.out.println(child.getName());
		System.out.println(poly.getName()); //notice how poly has the name of the Child class from being made with its constructor
		System.out.println();
		
		parent.polyMethod();
		child.polyMethod();
		poly.polyMethod(); //notice how even though poly is declared as a Parent it calls the Child version of the method, this is because java determined which to use at runtime (method overriding)
		System.out.println();
		
		parent.type(); //these throw warnings as a static method should be called in a static way, as in on the class itself: Parent.type();
		child.type();
		poly.type(); //notice how poly uses the Parent version, this is because the method type is static which causes method hiding, 
		//this is because the static keyword causes the method to be resolved at compile time (which is before runtime) so polymorphism is never used. Therefore it uses the method for the class it was declared as (Parent)
	}
}
