package AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
	Page.SignUp();	
	
		LoginPage lp =new LoginPage();
	    lp.header();
	    lp.title();
	
	HomePage hp = lp.login("admin","admin");
    hp.header();
    hp.title();
    hp.userdetails();
    hp.logout();
    
    
    
    
    //top casting--child class(login page) object is referred by parent class(page p)
    Page p  = new LoginPage();
    Page p1 = new LoginPage();
    
    p.header();
    p.title();
    p.logout();
    
    p1.header();
    p1.logout();
    p1.title();
    
    
	}

}
