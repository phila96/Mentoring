package Objects;


//This class shows the power of encapsulation (specifically information hiding) in a object oriented language
//It should be noted encapsulation also refers to bundling a class or object with its methods
public class Encapsulation
{
	public static void main(String[] args) 
	{
		Parent parent = new Parent();
		
		//System.out.println("The encapsulated field is: " + parent.encapsulated); //this would throw a error as encapsulated is private, therefore it can not be directly accessed
		System.out.println("The encapsulated field is: " + parent.getEncapsulated());
		System.out.println("The name field is: " + parent.name); //name is not private so it can be directly accessed
		System.out.println();
		
		//parent.encapsulated = "changed"; //again this would throw a error as encapsulated is private, therefore it can not be directly modified
		parent.setEncapsulated("changed");
		System.out.println("The encapsulated field is: " + parent.getEncapsulated());
		parent.name = "changed";
		System.out.println("The name field is: " + parent.name); //name is not private so it can be directly accessed
		
		//In this way encapsulation provides security that a Object's fields are only changed/accessed in predetermined ways.
		//Additionally encapsulation refers to bundling a Object with its methods (like how the Parent object calls it's methods on itself)
	}
}
