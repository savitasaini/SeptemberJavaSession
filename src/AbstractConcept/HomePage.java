package AbstractConcept;

public class HomePage extends Page {
	
	public HomePage(){
		System.out.println("HP const....");
	}
	
@Override
	public void header(){
	
System.out.println("HP--header");
		
	}
@Override
	public  void title(){
	System.out.println("HP--title");
		
	}
	
	public void userdetails(){
		System.out.println("HP--userdetails");
	}
	
}
