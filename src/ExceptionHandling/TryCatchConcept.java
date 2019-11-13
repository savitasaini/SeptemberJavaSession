package ExceptionHandling;

public class TryCatchConcept {
	
	String name = "Tom";
	public static void main(String[] args) {
		
	TryCatchConcept obj= new TryCatchConcept();
	
	System.out.println("A");
	System.out.println("B");
	
	
	//JVM will throw an exception with the help of:
	//1.it will create the object of Exception class
	//2.it will print the exception info with the help of stack trace and exception handler	
	
	try{
	   obj=null;   //null pointer exception-- we created obj as null.
		System.out.println(obj.name);
	int i = 9/0;
	}
	catch(ArithmeticException e){
		System.out.println("some exception occured....");
		e.printStackTrace();//to know what kind of exception occurred.
		System.out.println(e.getMessage());//or this message to get why ?
	}
	catch(NullPointerException e1){
		e1.printStackTrace();
	}
	System.out.println("C");
	System.out.println("C");	
	System.out.println("C");	
	System.out.println("C");	
	
try{		
int p=9/0;
	}
catch (Throwable e){
	e.printStackTrace();
}
	}
}

