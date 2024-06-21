package ProgramsJava;

import java.util.ArrayList;
import java.util.List;

/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * 
 */
public class Loops {
//	 loops 
	
	public void loops() {
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//		System.out.print("* ");
//			}System.out.println();
//		}
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=4;j++) {
//		System.out.print(i+" ");
//	}System.out.println();
//	}
//	System.out.println("=========i value===============");
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=5;j++) {
//			System.out.print(j+" ");
//		}System.out.println();
//	}
//	
//	System.out.println("=========j value===============");
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=4;j++) {
//			System.out.print(i+" "+j+" ");
//		}System.out.println();
//		
//	}
//	System.out.println("=========i,  j value===============");
//	for(int i=1; i<=5; i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(j);
//		}System.out.println();
//	}
//	
//	for(int i=1; i<=5; i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(i);
//		}System.out.println();
//	}
//	
//	for(int i=5;i>0;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(i+" ");
//		}System.out.println();
//	}
//	
//	for(int i=1;i<=6;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(j+" ");
//		}System.out.println();
//	}
	for(int i=0; i<3;i++) {
		for(char j='A';j<='A'+i;j++) {
			System.out.print(j+" ");
		}System.out.println();
	}
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(12);
	arr.add(14);
	arr.add(15);
	arr.add(16);
	arr.add(17);
	for(int ar:arr) {
		System.out.println(ar);
	}
	
	int n = 4;

    // Loop through the rows
    for (int i = 0; i < n; i++) {
        // Loop through the columns
        for (int j = 0; j < n; j++) {
            // Print '1' on the borders of the square
            if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                System.out.print("$ ");
            } else {
                // Print space in the hollow part
                System.out.print("  ");
            }
        }
        // Print a new line after each row
        System.out.println();
    }
	
	}

	public static void main(String[] args) {
		Loops l = new Loops();
		l.loops();
 	}

}
