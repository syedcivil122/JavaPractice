package accounts;

public class Savingsaccount {
	String Accountholder_Name="syed";
	long   AccountNumber= 21345678l;
	double salary= 212345.99;
	int    csv= 1234;
	String email = "syed123@,com";
	
public static void main(String[] args) {
	Savingsaccount s=new Savingsaccount();
	System.out.println(s.Accountholder_Name);
	System.out.println(s.AccountNumber);
	System.out.println(s.salary);
	System.out.println(s.csv);
	System.out.println(s.email);
}

}
