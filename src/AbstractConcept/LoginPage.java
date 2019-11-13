package AbstractConcept;

public class LoginPage extends Page{

	public LoginPage(){
		System.out.println("Lp const...");
	}
	
@Override	
public  void header(){
	System.out.println("LP-Header");
}
	

@Override	
public  void title(){
	System.out.println("LP-title");
}

public static void SignUp(){
	System.out.println("page--sign up");
}

	public HomePage login(String un,String pwd){
	System.out.println("Lp-login");
	System.out.println("login with " + un  + " and " + pwd);
	return new HomePage();	
	}
	
	
	
	
}
