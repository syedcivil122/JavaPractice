package functions;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> f= new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		};
		
		System.out.println(f.apply("Python"));
		
		Function<String, Integer> f1 = t-> t.length();
		System.out.println(f1.apply("Java Program"));
	}
}
