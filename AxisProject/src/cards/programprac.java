package cards;

public class programprac {
	
	public void Test(int a) {
		System.out.println("integer");
	}
	public void Test(int...a) {
		System.out.println("varargs");
	}
	public static void main(String[] args) {
		programprac p=new programprac();
		p.Test(10,20,34);
		
		int a =10, b=20;
		int t;
//		System.out.println("before swaping "+ a+" "+b);
//		t = a;
//		a=b;
//		b=t;
//		System.out.println("after swaping "+ a+" "+b);
		
		// Logic2  -use + & - without using third vairable
		
		a=a+b;  // a = 10+20  =30
		b= a-b;  // b = 30-20 = 10
		a= a-b;  //  a = 30-10 = 20
//		
		System.out.println("logic2"+ a + " "+ b);
		
		// Logic3 use * and / without using third vairable
		
		a = a*b; // 10*20 = 200
		b = a/b; //  200/20 = 10
		a = a/b; // 200/10 = 20
		System.out.println("logic3"+ a + " "+ b);
		
		// Logic4 use single statement
		
		b=a+b - (a=b);
		System.out.println("logic4"+ a + " "+ b);
	}

}
