package functions;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> c = new Consumer<>() {
			
			
			@Override
			public void accept(String t) {
				System.out.println("value is "+t);
				
			}
		};
		
		c.accept("Hello");
		
		Consumer<String> c2= t -> System.out.println("value is "+t);
		c2.accept("Recuired ");
	}
}
