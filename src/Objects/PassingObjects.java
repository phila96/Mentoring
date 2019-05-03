package Objects;

//This class shows the difference of passing a primitive versus a Object
public class PassingObjects
{
	//method to change the passed primitive variable
	public static void changePrimitive(String string)
	{
		string = "changed";
	}
	
	
	public static void main(String[] args) 
	{
		Parent parent;
		
		//How variables are passed in a method
		String string = "unchanged";
		System.out.println("string before the method: " + string);
		changePrimitive(string);
		System.out.println("string before the method: " + string);
		System.out.println(); 
		//As you can see from the above example the change is not kept, instead the method changePrimitive modifies a copy of string local to the method changePrimitive
		
		parent = new Parent();
		System.out.println("Create a parent and call a method to change its name"); 
		System.out.println("Name before the method: " + parent.getName());
		parent.passByReference();
		System.out.println("Name after the method: " + parent.getName());
		System.out.println();
		
		
		parent = new Parent();
		System.out.println("Create a parent and change its name by passing a copy"); 
		System.out.println("Name before the method: " + parent.getName());
		parent.passByCopy(parent);
		System.out.println("Name after the method: " + parent.getName());
		System.out.println();
		//As you can see from the above examples the change is kept regardless of how the object parent was passed, this is due to Java passing objects strictly by reference,
		//(even when they are a parameter and would normally be passed as a copy if they were a primitive (int, String, double))
	}
}
