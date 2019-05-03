package Objects;

//This class shows inheritance
public class Inheritance 
{
	public static void main(String[] args) 
	{
		Parent parent = new Parent();
		Child child = new Child();
		
		//Through inheritance Child now has all the methods of Parent (like getName())
		System.out.println(parent.getName());
		System.out.println(child.getName());
		System.out.println();
		
		//the child class can also have additional methods that the parent does not have
		child.childOnlyMethod();
		//parent.childOnlyMethod(); //would through a error as the method is undefined for parent
	}
}
