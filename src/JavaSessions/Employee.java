package JavaSessions;

public class Employee {
	
	String name;//class vars:declare at the class level
	int age;
	char gender;
	boolean isPermanent;
	
	
	public static void main(String[] args) {
		
			
		Employee e1=new Employee();
		
		e1.name ="Tom";
		e1.age = 25;
		e1.gender ='m';
		e1.isPermanent =true;
		System.out.println(e1.name+" "+e1.age+" "+e1.gender+" " +e1.isPermanent);
		
		Employee e2 = new Employee();
		e2.name ="Nadeem";
		e2.age = 26;
		e2.gender ='m';
		e2.isPermanent =true;
		
		Employee e3 = new Employee();
		e3.name ="Arusha";
		e3.age = 27;
		e3.gender ='f';
		e3.isPermanent =false;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.gender+" " +e1.isPermanent);
		System.out.println(e2.name+" "+e2.age+" "+e2.gender+" " +e2.isPermanent);
		System.out.println(e3.name+" "+e3.age+" "+e3.gender+" " +e3.isPermanent);
		
		
		
			
		e1=e2;
		e2=e3;
		e3=e1;
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
	}

}
