package functions;

@FunctionalInterface
public interface SyedIT {

	public String tagline();
	
	public static void main(String[] args) {
		SyedIT s= new SyedIT() {
			
			@Override
			public String tagline() {
				
				return "SyedIT Your Java Stop";
			}
		};
		
		String val= s.tagline();
		System.out.println(val);
		
		SyedIT s1= ()->  "SyedIT Your Java Stop";   // without parameter
		System.out.println(s1);
	}
}
