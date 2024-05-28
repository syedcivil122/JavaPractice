package Programs;

public class AssignmentsWhileLoop {
	
	public static void main(String[] args) {
		
//		 Write A program print 1 to 100 values
//		
		int i = 1;
		while(i<100) {
			System.out.println(i);
			i++;
		}
		
// Write a program even number 200 to 500
		
		int j = 200;
		while(j<500) {
			System.out.println(j);
			j++;
	}

//			
//// Write a program print the numbers which are divisible by 7 for th range of 150 to 200
			
			int k = 150;
			while(k<200) {
				if(k%7==0) {
				System.out.println(k);
			}
			k++;
		}
//// Write a program even number 40 to 80 sum values
		
		int k1 = 40;
		while(k1<80) {
			if(k1%2==0) {
			System.out.println(k1);
			}
			k1++;
		}
		
// Write a program odd numbers reverse
		System.out.println("odd numbers");
		int a =200;
		while(a>25) {
			if(a%3==0) {
			System.out.println(a);	
			}
			a--;
			
		}
			
	}
	

}
