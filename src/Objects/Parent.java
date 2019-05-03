package Objects;

public class Parent {
	
	String name;
	private String encapsulated;
	
	//Constructor for a new Parent Object
	Parent()
	{
		name = "parent";
		encapsulated = "encapsulated";
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public String passByCopy(Parent parent)
	{
		parent.name = "changed";
		return parent.name;
	}
	
	public String passByReference()
	{
		this.name = "changed";
		return this.name;
	}
	
	
	//The basis for encapsulation, "encapsulated" can only be accessed/changed by its getter and setter method
	public String getEncapsulated() {
		return encapsulated;
	}

	public void setEncapsulated(String passed) {
		encapsulated = passed;
	}
	
	public void polyMethod()
	{
		System.out.println("this is the Parent class version");
	}
	
	//note the static keyword, this allows the method call to be resolved at compile time
	public static void type()
	{
		System.out.println("parent class");
	}
	

}
