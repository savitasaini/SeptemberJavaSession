package AbstractConcept;

public abstract class Page {

	// we can write abstract methods and non abstract methods
	//cannot create the object of abstract class
	//abst class constructor can be called but it will be called with child class object
	//class object creation
	public Page(){
		System.out.println("Page class Const....");
	}
	public abstract void header();
	public abstract void title();
	
	public final void logout(){
		System.out.println("user logged out");
	}
	
	public static void SignUp(){
		System.out.println("page--sign up");
	}
	
	

	
}
