package inheritance;

public class User {
	public static void main(String[] args) {
		Guest g=new Guest();
		g.read();
		
		System.out.println("****developer");
		Developer d=new Developer();
		d.read();
		d.write();
		
		System.out.println("******admin");
		Admin a=new Admin();
		a.read();
		a.write();
		a.manage();
	}

}
