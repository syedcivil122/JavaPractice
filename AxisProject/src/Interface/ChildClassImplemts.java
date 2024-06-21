package Interface;

public  class ChildClassImplemts implements VechicleInterface{
	
	public void show() {
		System.out.println("method");
	}

	@Override
	public void show3() {
		System.out.println("sho3 method");
		
	}

//	@Override
//	public void m1() {
//		System.out.println("m1 method");
//		
//	}
//
//	@Override
//	public int add(String S) {
//		System.out.println("string");
//		return 0 ;
//	}
//
//	@Override
//	public void show2() {
//		System.out.println("show2");
//		
//	}
	
	public static void main(String[] args) {  // abstract class we can't create object
		ChildClassImplemts c=new ChildClassImplemts();
//		c.add("hi");
		c.show();
//		c.show2();
		c.show3();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	

}
