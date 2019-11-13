package JavaSessions;


//Can we overload main method-YES we can 
//Static main method -yes we can--call by class name or directly.


public class MainMethodOverloading {
	
	

	public static void main(String[] args) {
	
	main(10);	

	}
    public static void main(int a) {
    	System.out.println(a);
    	main(20,30);
    }	
    public static void main(int a ,int b) {
		System.out.println(a+b);

	}
    public void login(){
    
	}
	
	
}	
	

