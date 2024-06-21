package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Arraylist:
1)Enter 10 Integers: 1 8 9 2 6 6 1 3 5 5  
   your unique sorted elements: [1,2,3,5,6,8,9]

2)Enter 10 integers; 1 1 1 1 1 1 1 1 1 2
  your unique sorted elements; [1,2]

3) Enter 5 strings: Neso Neso Academy Academy Neso
   your unique sorted elements: [Academy , Neso]

4) Read N element from the user input user

 */
public class ArrayIntervQues {
	public void Question() {
		ArrayList<Integer> a = new ArrayList<>();
		
		System.out.println("Enter the number to store in an array");
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int temp =scanner.nextInt();
			
			if(!a.contains(temp))
				a.add(temp);
		}Collections.sort(a);
		
		System.out.println(a);
		scanner.close();
	}
	
	public void Question1() {
		ArrayList<Integer> b = new ArrayList<>();
		
		System.out.println("Enter the number to store in an array");
		Scanner Scan = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int tem = Scan.nextInt();
			
			if(!b.contains(tem))
				b.add(tem);
		}Collections.sort(b);
		System.out.println(b);
		Scan.close();
	}
	
	public void Question2() {
		Set<String> str = new TreeSet<String>(Arrays.asList("Academy","Nesco","Academy","Nesco","Academy","AAA"));
		
		for(String S:str) {
			System.out.println(S);
		}
//		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		ArrayIntervQues q=new ArrayIntervQues();
		q.Question2();
	}
}
