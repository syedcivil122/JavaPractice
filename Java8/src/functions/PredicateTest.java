package functions;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				
				return t.length() == 6;
			}
		};
		System.out.println(p.test("python"));
		
		
		Predicate<String> p1 = t -> t.length() == 7;
		System.out.println(p1.test("python"));
		
	}
}
