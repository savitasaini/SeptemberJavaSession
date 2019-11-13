package JavaSessions;

public class StaticAndNonStatic {
     String name;
     static int age;
     
	public static void main(String[] args) {
		//Main method is static and is called by java-JVM .We don not need to create object to call main method.
		//heap(Non static -Objects,ex-name ,search()) and stack memory(Static method eg int age ,getnamemethod()
//1.how to call static stuff:		
//a.use them directly:
		age=25;
		System.out.println(age);
        getName();	
  //b.call by class name:
        StaticAndNonStatic.age=30;
        System.out.println(StaticAndNonStatic.age);
        StaticAndNonStatic.getName();
  //2.how to call non static stuff:sreate the object
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.name = "Tom";
        System.out.println(obj.name);
        obj.search();
        obj.getName();
	}	
	
   public void search(){
   System.out.println("search method");
   }
   public static void getName(){
	   System.out.println("get name method");
   }
	}


