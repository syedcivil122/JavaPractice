package features;

public interface TeamLead {

	public void work();
	
	public default String role() {
		return "TeamLead";
	}
	
	public static String company() {
		return "Teja";
	}
}
