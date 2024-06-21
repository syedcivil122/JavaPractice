package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringExamples {
	 public static void main(String[] args) {
		
		 List<String> fruits = Arrays.asList("  banana","apPle","\\'manGo"," ","cherry","grapes"," ","apiNe\\napple","mango","apple","aJOm","Ap");
		 
		  fruits.stream()
	              .filter(f -> f.startsWith("a"))
		          .collect(Collectors.toList()).forEach(System.out::println);
          System.out.println();
	     
         
          String s1 = "grapes";
          String s2 = "mango";
          String s3 = "Mango";
	      fruits.stream()
//	             .filter(f -> f.isBlank())
//	             .filter(f -> f.isEmpty())
	             .filter(f-> f.equalsIgnoreCase(s3))  // mango
//	             .filter(f -> f.equals(s2)) // mango
//                 .filter(f -> f.contentEquals(s1))   //grapes
//                 .filter(f -> f.contains("rry"))   // cherry
//                 .filter(f -> f.endsWith("e"))  // apple, apineapple
                 .collect(Collectors.toList()).forEach(System.out::println);
//	          System.out.println(fruits);
	      System.out.println("--Blank----");
	      
	      fruits.stream()
//	             .filter(fruit -> !fruit.isEmpty() && !fruit.isBlank())
	             .filter(f -> f.length() > 9)
	             .forEach(System.out::println);
	      
	      System.out.println();
	          String s = "  strawberry";
	     fruits.stream()
	           .map(f -> f.toLowerCase())   // convert lowercase
//	           .map(f -> f.translateEscapes())
//	           .map(f -> f.chars())
//	           .map(f -> f.trim())  // remove white spaces
//	           .map(f -> f.substring(2))   // string word remove starts characters
//	           .map(f -> f.replace(s1, s3))    // replace oldcharsequence to newcharsequence EX; Mango
//	           .map(f -> f.replace('a', 'z'))   // replace oldchar to newchar
//	           .map(f -> f.repeat(2)) // double time execute string element
//	           .map(f -> f.intern())  // ==
//	           .map(f -> f.indent(10))  // space index
//	           .map(f -> f.concat(s)) 
               .collect(Collectors.toList()).forEach(System.out::println);
	     System.out.println();  
	        
	     fruits.stream()
	            .distinct() 
                .collect(Collectors.toList()).forEach(System.out::println);
	     System.out.println();
	     
	     fruits.stream()
	           .sorted() 
               .collect(Collectors.toList()).forEach(System.out::println);
	     System.out.println();
        
        fruits.stream()
               .limit(5)
               .skip(1)
              .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();  
           
	     fruits.stream()
	            .filter(f -> f =="grapes")
//                .map(f -> f + " Custterapple") 
                .map(f -> f.toUpperCase()+" ")  // BANANA, APPLE, MANGO, CHERRY, GRAPES, APINEAPPLE, MANGO, JOM 
                .distinct() //  BANANA, APPLE, CHERRY, GRAPES, APINEAPPLE, JOM 
                .sorted() //   APINEAPPLE, APPLE, BANANA, CHERRY, GRAPES JOM MANGO                
                .limit(5)  // APINEAPPLE, APPLE, BANANA, CHERRY, GRAPES
               .skip(1)   // APPLE, BANANA, CHERRY, GRAPES 
                .forEach(f -> System.out.print(f));
	     
	     System.out.println("************* fruits *****************");
		List<String> fruits1 = fruits.stream().filter(f -> f.startsWith("a")).distinct().collect(Collectors.toList());
		 fruits1.stream().forEach(System.out::println);
		 
		 
		 System.out.println("----------Strings Min & Max operations --------------- ");
		 List<String> name = Arrays.asList("YY","UU","AA","VVZDGHJKFSAW");
		 Optional<String> Min = name.stream()
				                      .min(String::compareTo);
		 System.out.println("min "+Min);
		 
		 Optional<String> minElement = name.stream()
                 .min(String::compareTo);
          System.out.println("Minimum element: " + minElement.orElse("List is empty"));

          Optional<String> maxElement = name.stream()
                  .max(String::compareTo);
           System.out.println("Maximum element: " + maxElement.orElse("List is empty"));

		  String findFist = fruits.stream().findFirst().get();
		  System.out.println(findFist);
		  
		  String findAny = fruits.stream().findAny().get();
		  System.out.println(findAny);
		  
		  Boolean anyMatch = fruits.stream().anyMatch(t -> t == "cherry");
		  System.out.println(anyMatch);
		  
		  Boolean allMatch = fruits.stream().allMatch(t -> t.length() < 10);
		  System.out.println(allMatch);
		  
		  Boolean allMatch1 = fruits.stream().allMatch(t -> t.isBlank());
		  System.out.println(allMatch1);
		  
		  Boolean allMatch2 = name.stream().allMatch(t -> t.startsWith("Y"));
		  System.out.println(allMatch2);
		  
		  String st = "JKFSAW";
		  Boolean allMatch3 = name.stream().allMatch(t -> t.regionMatches(3, st, 0, 5));
		  System.out.println(allMatch3);
//		  System.out.println(st.charAt(0));
		  
		  Boolean noneMatch = name.stream().noneMatch(t -> t.matches("BB"));
		  System.out.println(noneMatch);
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
			    
		 
	}

	@Override
	public String toString() {
		return "StringExamples []";
	}
}
