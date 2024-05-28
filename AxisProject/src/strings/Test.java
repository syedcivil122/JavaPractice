package strings;

public class Test {
	
	public static void main(String[] args) {
		String s = "hello";
		String s12 = "hello";
		String s1 = "Hello";
		String s2 = new String("hello");
		String s3 = new String("hello");
		String s4 = "syed";
		String s5 = "Arifulla";
		String s6 = "arifulla";
		String s7 = "python is a very easy language";
		String s8 = new String("syed");
		String s9 = "1";
		String s10 = "1";
		String s11 = new String("1");
		System.out.println(s1==s); //false
		System.out.println(s2==s3); //false
		System.out.println(s5==s8); //false
		System.out.println(s9==s10); //true
		System.out.println(s==s12); //true
		System.out.println(s.equals(s12)); //true
		System.out.println(s.equals(s1)); //false
		System.out.println(s2.equals(s3)); //true
		System.out.println(s9.equals(s10)); //true
		System.out.println(s9.equals(s11)); //true
		System.out.println(s5.equals(s6)); //false
	}

}
