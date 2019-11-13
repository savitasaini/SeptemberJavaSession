package JavaSessions;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeData e1= new EmployeeData("Steve",2,25,"Admin",2000);
		System.out.println(e1.name);
	//	System.out.println(e1.salary);//Since it was private in employeedata  class u cannot access
		
	e1.getEmployeeName();
	//e1.getEmployeeBonus();//U cannot access beoz its private in Employeedata and cannot be accessed outside the class.
		//for int we go for get and set methods to access salary .
	
	e1.setSalary(5000);
	System.out.println(e1.getSalary());
	
	}

}
