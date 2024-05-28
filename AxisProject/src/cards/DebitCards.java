package cards;

public class DebitCards {
	String Accountholder_Name="syed";
	long   AccountNumber= 21345678l;
	double salary= 212345.99;
	int    csv= 1234;
	String email = "syed123@,com";
	
	public static void main(String[] args) {
		DebitCards d=new DebitCards();
		System.out.println(d.Accountholder_Name);
		System.out.println(d.AccountNumber);
		System.out.println(d.salary);
		System.out.println(d.email);
		
	}

}
