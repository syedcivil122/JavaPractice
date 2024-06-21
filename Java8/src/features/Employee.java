package features;

public class Employee implements Manager, TeamLead{

	@Override
	public void work() {
		System.out.println("Employee Work Method");
		
	}

	@Override
	public String role() {
		// TODO Auto-generated method stub
		return TeamLead.super.role();
	}

//	@Override
//	public String role() {       // duplicate method name
//		// TODO Auto-generated method stub
//		return Manager.super.role();
//	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.work();
		System.out.println(e.role());
		System.out.println(Manager.company());
		System.out.println(TeamLead.company());
	}

}
