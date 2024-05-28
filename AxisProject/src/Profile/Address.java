package Profile;

public class Address {
	
	public void location() { //method
	String city="hyderabad";
	String area="sr nagar";
	int    pincode=23456;
	System.out.println("location :");
	
	}
	
	public void relocation(){
		String city1="bangalore";
		String area1="madiwala";
		int    pincode1=23456;
		System.out.println("re-location :");	
		      
		
	}
	
	public static void main(String[] args) {
		Address a=new Address();
		        a.location();
		        a.relocation();
	}

}
