package ExceptionHandling;

public class FinallyConcept {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try{
			int i = 9/0;
			//connect to DB
			//get the data from DB ---exception is coming...
		}
		catch (Exception e){
			System.out.println("some exception is coming");
		}
		finally{
			System.out.println("disconnect to Db");
			System.out.println("Run this line ....");
		}
		
		
		
		

	}

}
