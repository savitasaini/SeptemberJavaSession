package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) {
		int n[]= new int[5];
		n[0]=0;
		n[1]=1;
		n[2]=2;
		n[3]=3;
		n[4]=4;
				
      System.out.println(n.length);
      System.out.println(n[0]+n[1]);
      //print all values from array
      //if u use <= n.lenght -1 has to be used else remove =
      for(int k=0;k<=n.length-1;k++){
      System.out.println(n[k]);
	}
      System.out.println("_______________");
      for(int m=4;m>=0;m--){
    	  System.out.println(n[m]);
      }
	}
}
