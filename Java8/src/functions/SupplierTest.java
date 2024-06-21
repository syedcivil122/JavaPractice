package functions;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Integer> s= new Supplier<Integer>() {  // annanomus type
			
			@Override
			public Integer get() {
				
				return 4*4;
			}
		};
		
		System.out.println(s.get());
		
		Supplier<String> st = new Supplier<String>() {
			
			@Override
			public String get() {
				
				return "Hello";
			}
		};
		System.out.println(st.get());
		
		
		Supplier<Integer> s1 = () -> 5*4;  // lamda experssion
		System.out.println(s1.get());
		
		Supplier<String> st1 = () ->  "Java";
		System.out.println(st1.get());
		
		
	}
}
