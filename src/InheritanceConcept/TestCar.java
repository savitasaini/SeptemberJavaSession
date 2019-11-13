package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
	
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoAirSuspension();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//Top Casting:U cast child obj 
		//static method cannot be over ridden.
		//final method cannot be over ridden
		//public final class --u cannot inherit another class
		
		Car c1= new BMW();//child class object can be referred by parent class ref variable.
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new Car();
		Vehicle v2 = new BMW();
		v2.engine();
		v1.engine();
		
		
		//down casting:parent claass
//	BMW	b1= (BMW)new Car();//classcastexception
		
		

	}

}
