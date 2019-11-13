package JavaSessions;

public class SeleniumWebDriver {

	public void launchBrowser(String browser,String OS){
		interactWithBrowser(browser,OS);
		
		
	}
	private void interactWithBrowser(String browser,String OS){	
	if(browser.equals("chrome")){
		interactWithChromeServices(OS);
		System.out.println("launch chrome");
	}
	else if(browser.equals("firefox")){
		interactWithFirefoxServices(OS);
		System.out.println("launch firfox");
	}
	}
	private void interactWithChromeServices(String OS){
		if(OS.equals("WIN")){
			System.out.println("WIN--Chrome");
		}
	
		else if (OS.equals("MAC")){
			System.out.println("MAC--Chrome");
	}
		else if (OS.equals("LINUX")){
			System.out.println("LINUX--Chrome");
		}
	}
		private void interactWithFirefoxServices(String OS){
			if(OS.equals("WIN")){
				System.out.println("WIN--Firefox");
		}
			else if (OS.equals("MAC")){
				System.out.println("MAC--Firefox");	
		}
			else if (OS.equals("LINUX")){
				System.out.println("LINUX--Firefox");
			}
	
}
}