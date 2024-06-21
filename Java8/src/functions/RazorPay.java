package functions;

@FunctionalInterface
public interface RazorPay {
	public String payment(String name);
	
	public static void main(String[] args) {
		RazorPay r = new RazorPay() { // annamous Function
			
			@Override
			public String payment(String name) {
				
				return name + "your payment done.";
			}
		};
		System.out.println(r.payment("Rahul "));
		
		
		// lamda method
		RazorPay r1 =  name -> name + "your payment done.";
		System.out.println(r1.payment("Rohan "));
	}
}
