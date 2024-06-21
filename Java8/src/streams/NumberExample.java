package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberExample {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,3,2,4,6,7,12,24,12,2,3,5,7,9,23,25,45,17,66,76);
		
		// intermediate Stream Api methods
		list.stream() // it process the collections of elements
		.filter(t -> t%2 == 0) // filter the elements
//		.map(t -> t*2)   // map tthe elements(to apply the logic)
//		.distinct()   // remove the duplicate elements
//		.sorted()  // sort the elements
//		.limit(5)   // limit the n number of elements
//		.skip(2)   // skip the n numbers of elements
		.forEach(t -> System.out.print(t +" ")); // iterate the elements
		
		System.out.println();
		
		// using single  methods or one by one methods
		list.stream().filter(t -> t % 2 == 1).forEach(System.out::println);
		list.stream().map(t -> t*2).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
		list.stream().sorted().forEach(System.out::println);
		list.stream().limit(6).forEach(System.out::println);
		list.stream().skip(2).forEach(System.out::println);
		
		// Multiple methods using Single line logic
		list.stream().filter(t -> t % 2 == 1).map(t -> t*2).distinct().sorted().limit(5).skip(2)
		                                                          .forEach(System.out::println);
		
		System.out.println("========================================");
		
		
		list.stream().forEach(System.out::println);
		
		// createing new list object
		List<Integer> list2 =list.stream().filter(x -> x % 2 != 0).distinct().collect(Collectors.toList());
		list2.stream().forEach(System.out::println);
		
		System.out.println("===============Aggregate Operations==================");
		
		// max,min, count, sum, avg
		
		Optional<Integer> max =list.stream().max((x,y)-> x-y);
		System.out.println("max = "+max);
		
		Integer max2 = list.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println("max2 = "+max2);
		
		Integer max3 = list.stream().max((x,y) -> Integer.compare(x, y)).get();
		System.out.println("max3 = "+max3);
		
		Integer max4 = list.stream().max(Integer::compare).get();
		System.out.println("max4 = "+max4);
		
		Integer max5 = list.stream().mapToInt(x -> x).max().getAsInt();
		System.out.println("max5 = "+max5);
		
		Integer min = list.stream().min(Integer::compare).get();
		System.out.println("min = "+min);
		
		long count = list.stream().count();
		System.out.println("count = "+count);
		
		Integer sum = list.stream().mapToInt(x -> x).sum();
		System.out.println("sum = "+sum);
		
		double avg = list.stream().mapToDouble(x -> x).average().getAsDouble();
		System.out.println("avg = "+avg);
		
		System.out.println("--------Find operations-----------");
		
		Integer findFirst = list.stream().findFirst().get();
		System.out.println(findFirst);
		
		Integer findAny = list.stream().findAny().get();
		System.out.println(findAny);
		
		System.out.println("--------- Match Operations---------");
		
		Boolean anyMatch = list.stream().anyMatch(t -> t == 7);
		System.out.println(anyMatch);
		
		Boolean allMatch = list.stream().allMatch(x -> x < 50);
		System.out.println(allMatch);
		
		Boolean noneMatch = list.stream().noneMatch(t -> t == 10);
		System.out.println(noneMatch);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
