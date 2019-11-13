package JavaSessions;

import java.util.ArrayList;

public class FinctionsInJava {
	//class members:
	//class methods-class properties
	//Main is also a function

	public static void main(String[] args) {
		FinctionsInJava obj =new FinctionsInJava();
		obj.test();
		int sum= obj.add();
		System.out.println(sum+20);
		String n1 = obj.getTrainerName();
		System.out.println(n1+ "from India");
		String days[] = obj.getWeekDayNames();
		System.out.println(days[0]+ " "+days[1]);
		System.out.println("**********************");///u can use for loop also 
		for (int k =0;k<days.length;k++);
		System.out.println(days[2]);
		
		int d1 = obj.division(10,30);
		System.out.println(d1);
		int d2 = obj.division(40, 80);
		System.out.println(d2);
	System.out.println(obj.getCapitalName("India"));
	System.out.println(obj.getCapitalName("USA"));
	System.out.println(obj.getCapitalName("Srilanka"));
	ArrayList<String>ar = obj.getStudentList("sept");
	System.out.println(ar.size());
	for(String n:ar){
		System.out.println(n);
	}
	String hodName=obj.getHODName("CS");
	System.out.println(hodName);
	}
//1.no input & no  return:	
//void-can not return anything
	public void test(){
	System.out.println("test method");	
	}
//2.no input but some return:
	public int add(){
		System.out.println("add method");
		int a =10;
		int b =20;
		int c =a+b; //30
		return c;	
	}
	public String getTrainerName(){
		System.out.println("get trainer name");
		String name= "Naveen";
		return name;
	}
	 public String[] getWeekDayNames(){
	String day[]=new String[7];	 
	day[0]="Monday";
	day[1]="Tuesday";
	day[2]="Wednesday"; 
	return day;
	 }
	 
	 
	//3.some input and some return:
	
	public int division(int a,int b){
	System.out.println("division method");
	int d =b/a;
	return d;
	}

    public String getCapitalName(String countryName){
    if(countryName.equals("India")){
    	return "New Delhi";
    }
    else if(countryName.equals("USA")){
    	return"Washington DC"; 	
    }
    else if(countryName.equals("Russia")){
    	return"Moscow"; 	
    }
    else if(countryName.equals("Japan")){
    	return"Tokyo";	
    }
    else{
    return"capital not found";
    }
    }
    public ArrayList<String> getStudentList(String batchName){
    ArrayList<String> studentList = new ArrayList<String>();
    
    if(batchName.equals("sept")){
    	studentList.add("Gulnaz");
    	studentList.add("Nagi");
    	studentList.add("Rakesh");
    	studentList.add("Shweta");
    }
    else if(batchName.equals("Aug")){
    	studentList.add("Tom");
    	studentList.add("Anusha");
    }
    return studentList;   
    }
  
    
    public String getHODName(String deptName){
    if(deptName.equals("CS")){
    	return "Naveen";
    }
    else if (deptName.equals("EE")){
    	return "Tom";
    }	
    else{
    	return null;
    }
}   
}