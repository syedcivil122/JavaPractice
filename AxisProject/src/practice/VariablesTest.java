package practice;



public class VariablesTest {
	
		
		  int a = 12;  //instance variables
		static int b =13; //static variable
		final int z =23;
		 private void test() {
			int c =30,d; //local variable
			    d = a+b+c+z;
			    System.out.println(d);
	}
		
		protected void test1() {
			int e = 40,f;
			    f = a+b+e;
			    System.out.println(f);
			
		}
		
		 public  void test2() {
			int e = 40,f;
			    f = a+b+e;
			    System.out.println(f);
			
		}
		
		public static void main(String[] args) {
			VariablesTest v=new VariablesTest();
			              v.test();
			              v.test1();
		
		}

}
