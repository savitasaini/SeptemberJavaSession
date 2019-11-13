package JavaSessions;



public class IfElseConditional {

	public static void main(String[] args) {
int a = 100;
int b = 200;
int c = 300;

	if(a>b & a>c){
		System.out.println("a is greatest:"+ 100);
	}
	else if(b>c){	
		System.out.println("b is greatest:"+ 200);
	}
	else
		System.out.println("The greatest:"+ 300);
	
	System.out.println("*******");
	
	int p = 99;
	int q =101;
	int r =900;
	int s =1000;
	
	if(p>q & p>r & p>s){
		System.out.println("p is greater:"+99);
	}
	else if(q>r & q>s &q>p){
		System.out.println("q is greater:"+101);
	}
	else if(r>s &r>p & r>q){
	System.out.println("r is greater:"+900);
	}
	else 
		System.out.println("s the greatest:"+1000);
	}
	
		
	
}





