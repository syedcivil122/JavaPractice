package constructor;

public class PrivateConst {
	private PrivateConst() {
		System.out.println("no argument private constructor");
	}
	
	private PrivateConst(boolean b) {
		System.out.println("parameter private constructor");
	}
	public static void main(String[] args) {
		PrivateConst p =new PrivateConst();
		PrivateConst p1 =new PrivateConst(true);
		
	}

}
