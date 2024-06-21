package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	
	int eid;
	String ename;
	String edepart;
	long mobile;
	long salary;
	
	
	public Employee(int eid, String ename, String edepart, long mobile, long salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepart = edepart;
		this.mobile = mobile;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edepart=" + edepart + ", mobile=" + mobile + ", salary="
				+ salary + "]";
	}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEdepart() {
		return edepart;
	}

	public void setEdepart(String edepart) {
		this.edepart = edepart;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public int hashCode() {
		return Objects.hash( eid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return  eid == other.eid ;
	}

	public static void main(String[] args) {
		List<Employee> list= Arrays.asList(new Employee(121, "sonu",  "java", 4567892L, 25000),
				                           new Employee(111, "rohan", "sql",  3456783L, 20000),
				                           new Employee(99,  "sonu",  "oracle",8764345L,21000),
				                           new Employee(121,  "danush","python", 0345556L,15000),
				                           new Employee(12,  "naveen","linix", 7634456L, 5000),
				                           new Employee(21,  "rajesh","golan", 3244567L, 2000),
				                           new Employee(101, "parveen","html", 5445678L, 22000));
		
		
       List<Employee> filteredEmployees = list.stream()
	                         .filter(emp -> emp.ename.equals("rajesh"))  //  Filter by ename equals "rajesh"
//	                         .filter(emp -> emp.edepart.equals("oracle")) // Filter by edepart equals "oracle"
//	                         .filter(emp -> emp.eid == 101)      // Filter by eid equals 101
//	                       .filter(emp -> emp.mobile == 7634456)  // Filter by mobile equals 7634456
//	                       .filter(emp -> emp.salary == 20000)  // Filter by salary equals 20000
	                         .collect(Collectors.toList());
       filteredEmployees.forEach(System.out::println);
       
       List<Employee> modifiedEmployees = list.stream()
    		   .map(emp -> {  // Modify Employee Names
    			   if(emp.eid == 21) {
    				   return new Employee(emp.eid, emp.ename + " reddy ", emp.edepart + "guage ", emp.mobile, emp.salary);
    			   }else {
    				   return emp;
    			   }
    		   })
//               .map(emp -> new Employee(emp.eid, emp.ename + " Jr.", emp.edepart, emp.mobile, emp.salary))
               .collect(Collectors.toList());
       modifiedEmployees.forEach(System.out::println);
       
       List<Object> filteredEmployees2 = list.stream()
//    		                   .map(emp -> emp.salary)    // Map to Employee salary
    		                   .map(emp -> emp.ename+ "  - " +emp.edepart)  // Map to Custom String Reprasenting
//    		                   .map(Employee::getEname)   // Map to employee names
    		                   .collect(Collectors.toList());
    // Print column headers
       System.out.println("ename - edepart");
       filteredEmployees2.forEach(System.out::println);
       
       System.out.println("----distinct Eid----------");
       List<Employee> distinctEmployees = list.stream()
    		   .filter(emp -> emp.ename.equals("rajesh"))
               .distinct()
               .sorted(Comparator.comparingInt(Employee::getEid))
               .limit(4).skip(2)
               .collect(Collectors.toList());

       // Print the distinct employees
       distinctEmployees.forEach(System.out::println);
       
       System.out.println("--------Sorted Eid----------");
       List<Employee> sortedEmployees = list.stream()
    		                           .sorted(Comparator.comparingInt(Employee::getEid))
    		                           .collect(Collectors.toList());
               
       sortedEmployees.forEach(System.out::println);
       
       System.out.println("--------Limit & Skip Method ----------");
       List<Employee> limitSkipEmployees = list.stream()
    		                           .limit(4).skip(2).collect(Collectors.toList());
       limitSkipEmployees.forEach(System.out::println);
       
//       System.out.println("--------Skip Method ----------");
//       List<Employee> skipEmployees = list.stream()
//    		                           .skip(2).collect(Collectors.toList());
//       skipEmployees.forEach(System.out::println);
       
       System.out.println("------- Min & Max Employee Salary------------");
       Optional<Employee> minMaxEmployee = list.stream()
//               .min(Comparator.comparingLong(Employee::getSalary));
               .max(Comparator.comparingLong(Employee::getSalary));
               
//       System.out.println(minMaxEmployee);  // output show Optional word
       minMaxEmployee.ifPresent(System.out::println);  // ifPresent() is used to handle the Optional result and print 
      
	   System.out.println("---------Terminal Operations----------");
	   
	   Employee findFirst = list.stream().findFirst().get();
	   System.out.println(findFirst);
	   
	   Employee findAny = list.stream().findAny().get();
	   System.out.println(findAny);
	   
	   Boolean anyMach = list.stream().anyMatch(emp -> emp.ename == "rohan" );  // true
	   System.out.println(anyMach);
	   
	   Boolean allMach = list.stream().allMatch(emp -> emp.salary <= 25000);  // true
	   System.out.println(allMach);
	   
	   Boolean noneMach = list.stream().noneMatch(emp -> emp.ename == "rohan123" );  // true
	   System.out.println(noneMach);
	
	}
	


}
