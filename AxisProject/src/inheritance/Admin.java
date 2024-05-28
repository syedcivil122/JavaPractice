package inheritance;
//multilevel inheritance
public class Admin extends Developer{ //Admin is a Sub-Child
	
	//Adding or deleting the products/application
	public void manage() {
	    super.read();//parent method we use super keyword
		write();
		System.out.println("manage the code");
		
	}
	
	public void read() {//sub-child method
		
	}
//	public static void main(String[] args) {
//		Admin a=new Admin();
//		a.read();
//		a.write();
//		a.manage();
//		
//	}

}
