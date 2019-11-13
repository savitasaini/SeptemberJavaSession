package JavaSessions;



public class FunctionHW {

	public static void main(String[] args) {
		
		FunctionHW obj = new FunctionHW();
		int sum= obj.add();
		System.out.println(sum);
         int p=obj.product();
         System.out.println(p);
         String k=  obj.maxmin(100, 200, 300);
         System.out.println(k);
	}
    public int add(){
    	System.out.println("add numbers");
    	int a=10;
    	int b=20;
    	int c = a+b;
    	return c;
    }
    public int product(){
    	System.out.println("multiply numbers");
    	int m=5;
    	int n=5;
    	int o = m*n;
    	return o;
    }
	public String maxmin(int a1,int b1,int c1){
		System.out.println("max min method");
		
		if(a1>b1 & a1>c1){
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1){	
			System.out.println("b1 is the greatest");
		}
		else {
			return("c1 is the greatest");
		}
		return null;
}
	
	
	
	
}



