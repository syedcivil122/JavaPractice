package accounts;

public class Jointaccount {
	String JointHolder_Name="Arif";
	String Accountholder_Name="syed";
	long   AccountNumber= 21345678l;
	double salary= 212345.99;
	int    csv= 1234;
	String email = "syed123@,com";
	
	public static void main(String[] args) {
		Jointaccount  j=new Jointaccount();
		System.out.println(j.JointHolder_Name);
		System.out.println(j.Accountholder_Name);
		System.out.println(j.AccountNumber);
		System.out.println(j.salary);
		System.out.println(j.csv);
		System.out.println(j.email);
					  
		
	}

}
