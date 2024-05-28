package cards;

public class CreditCards {
	String Accountholder_Name="syed";
	long   AccountNumber= 21345678l;
	double salary= 212345.99;
	int    csv= 1234;
	String email = "syed123@,com";
	
	public static void main(String[] args) {
		CreditCards  cd=new CreditCards();
		System.out.println(cd.Accountholder_Name);
		System.out.println(cd.AccountNumber);
		System.out.println(cd.email);
		System.out.println(cd.csv);
	}

}
