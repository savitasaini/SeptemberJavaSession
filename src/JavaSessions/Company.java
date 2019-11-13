package JavaSessions;

//Encapsulation:to encapsulate the data in the form of variables and methods.
//how to access them u create public methods in the form of getter and setter or
//simple create public methods where u are calling private methods and give this public method to the end user.
public class Company {

	public String name;
	public int totalEmp;
	private int budget;
	private String projects;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalEmp() {
		return totalEmp;
	}
	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	
	
	
	
}
