package functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductComparator {
	private int pid;
	private String pname;
	private int price;
	
	public ProductComparator(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "ProductComparator [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ProductComparator pc1 = new ProductComparator(12, "cement", 360);
		ProductComparator pc2 = new ProductComparator(24, "paint", 1000);
		ProductComparator pc3 = new ProductComparator(121, "steel", 1200);
		ProductComparator pc4 = new ProductComparator(1, "marble", 80);
		ProductComparator pc5 = new ProductComparator(4, "pop", 130);
		
		List<ProductComparator> list=Arrays.asList(pc1,pc2,pc3,pc4,pc5);
		
		List<ProductComparator> list1 = Arrays.asList(new ProductComparator(12, "cement", 360),
				                                     new ProductComparator(24, "paint", 1000),
				                                     new ProductComparator(121, "steel", 1200),
				                                     new ProductComparator(1, "marble", 80),
				                                     new ProductComparator(4, "pop", 130),
				                                     new ProductComparator(8, "doors", 111));
		
		Comparator<ProductComparator> byPrice = new Comparator<ProductComparator>() {  // anonumus type
			
			@Override
			public int compare(ProductComparator o1, ProductComparator o2) {
				return o1.price - o2.price;
			}
		};
		Collections.sort(list, byPrice);
//		list.stream().forEach(System.out::println);
//		list.forEach(System.out::println);
//		for(ProductComparator price:list) {
//			System.out.println(price);
//		}
		
      Comparator<ProductComparator> byName = (o1,  o2) ->  o1.pname.compareTo(o2.pname) ; // Lamda function
      Collections.sort(list1, byName);
        list1.forEach(System.out::println);  
        
        Comparator<ProductComparator> byPric = (o1,  o2) ->  o1.price - o2.price ; // Lamda function
        Collections.sort(list1, byPric);
		
	}
	
}
