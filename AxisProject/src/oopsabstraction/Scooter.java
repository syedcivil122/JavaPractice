package oopsabstraction;

public class Scooter extends Vechicle{
	public void start() {
		System.out.println("Scooter starts with kick");
	}
	
	public void test() {
		System.out.println("test");
	}
public static void main(String[] args) {
	//Vechile v =new Vechicle(); we can't create abstract class object
	Car c= new Car();
	c.start();
	
	Scooter s = new Scooter();
	       s.start();
	       s.test();
			
		}
	
}

