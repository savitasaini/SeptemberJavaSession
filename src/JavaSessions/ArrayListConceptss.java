package JavaSessions;

import java.util.ArrayList;





public class ArrayListConceptss {

	

	

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();

		System.out.println(ar.size());
     ar.add(100);//0
     ar.add(200);//1
System.out.println(ar.size());
     ar.add(300);//2
    ar.add(400);//3
System.out.println(ar.size());
    ar.add(500);//4
     ar.add(600);//5
     
     ar.add("test");
     ar.add(12.33);
     
     System.out.println(ar.remove(4));
     System.out.println("********");
System.out.println(ar.size());
System.out.println(ar.get(0));
System.out.println(ar.get(4));
System.out.println(ar.get(4));

//IndexoutofboundException//(ar.get(6));

     ArrayList<String> names =new ArrayList<String>();
     names.add("savvy");
     names.add("Aanya");
     names.add("Anusha");
     
     System.out.println(names.size());
     
     ArrayList<Integer> EmpAge = new ArrayList<Integer>();
     EmpAge.add(20);
     EmpAge.add(24);
     EmpAge.add(30);
     System.out.println(names.get(0)+"  "+EmpAge.get(0));
     
     for(int p=0;p<names.size();p++){
    	 
	System.out.println(names.get(p)+" " +EmpAge.get(p));
    	 
 //   EmpAge.forEach((a)->System.out.println(a));
 
     }
     //00 01 02 03 04 05 06 07 08 09
     //10 11 12 13 14 15 16 17 18 19
     
     for(int i =0;i<=9; i++){
    	 for(int j=0;j<=9; j++){
    		 System.out.print(i+""+j+" ");
    	 }
    	 System.out.println();
     }
     System.out.println("_______");
     
     ArrayList<String> colours = new ArrayList(); 
     colours.add("Violet");
     colours.add("Indigo");
     colours.add("Blue");
     colours.add("Green");
     colours.add("yellow");
     System.out.println(colours.size());
     System.out.println(colours.get(3));
     colours.add(0, "sparkling");
     colours.add(6, "Last");
     System.out.println(colours.size());
     colours.remove(3);
     
     
     System.out.println(colours.get(4));
     colours.add(3, "floral");
System.out.println(colours.get(3));
colours.add(7, "lavish");
System.out.println(colours.size());
for(int cl=0;cl<colours.size();cl++){
	System.out.println(colours.get(cl));
}
System.out.println("*****");
for(int m=0;m>colours.size();m--){
	System.out.println(colours.get(m));
}
     }
	}
	
