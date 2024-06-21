package constructor;

public class PrivateChild extends PrivateConst{ // private constructor can't extends in child class 
	public static void main(String[] args) {
		PrivateConst p =new PrivateConst(); // 
	}

}
