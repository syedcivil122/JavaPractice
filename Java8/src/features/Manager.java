package features;

public interface Manager {
	
	public void work();
	
	public default String role() {
		return "Manager";
	}
	
	public default String project() {
		return "IndusInd Bank";
	}
	
	public static String company() {
		return "IndusInd";
	}

}
