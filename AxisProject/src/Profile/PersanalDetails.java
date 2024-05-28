package Profile;

public class PersanalDetails {
private static final int i = 0;
	/*
 * Star Pattern program
 * 
 * Output: Test Method
 *           * 
 *           * * 
 *           * * * 
 *           * * * * 
 *           * * * * * 
 */
	void Test( ) {
		int rows = 5; // Number of rows for the pattern
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
	        }
	        System.out.println();
		}
		
	}
// Out put:	Test1 Method
//  * * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

    void Test1() {
        int rows = 5; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//OutPut: Test2 Method
//    * 
//    * * 
//    * * * 
//    * * * * 
//    * * * * * 
//    * * * * * 
//    * * * * 
//    * * * 
//    * * 
//    *   
//    void Test2() {
//    	for(int i=1;i<=5;i++) {
//    		for(int j=4;j<=i;j++) {
//    			System.out.print("*");
//    		}
//    		System.out.println();
//    	}for(int i=1;i<=5;i++) {
//    		for(int j=5; j>=i;j--) {
//    			System.out.print("*");
//    		}
//    	}System.out.println();
//    }
//   
//    OutPut: Test3 Method
//       *
//      **
//     ***
//    ****
//   *****
  
    void Test3() {
    	for(int i=1; i<=5; i++) {
    		for(int j=4;j>=i;j--) {
    			System.out.print(" ");
    		}
    		 for(int k=1; k<=i; k++) {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	}
    }
// Output: Test4 Method
//    *****
//     ****
//      ***
//       **
//        *  
    void Test4() {
    	for (int i=1; i<=5; i++) {
    		for(int j=1; j<=i;j++) {
    			System.out.print(" ");
    		}
    		for(int k=4; k>=i;k--) {
    			System.out.print("*");
    		}System.out.println();
    	}
    }
// OutPut : Test5 Method
//       *
//      **
//     ***
//    ****
//   *****
//    ****
//     ***
//      **
//       * 
    void Test5() {
    	for(int i=1; i<=5; i++) {
    		for(int j=4; j>=i;j-- ) {
    			System.out.print(" ");
    		}for(int k=1;k<=i;k++) {
    			System.out.print("*");
    		}System.out.println();
    	}for(int i=1; i<=5;i++) {
    		for(int j=1; j<=i;j++) {
    			System.out.print(" ");
    		}for(int k=4;k>=i;k--) {
    			System.out.print("*");
    		}System.out.println();
    	}
    }
//   Output: Test6 Method
//             *
//            * *
//           * * *
//          * * * *
//         * * * * *    
    void Test6() {
    	for(int i=1;i<=5;i++) {
    		for(int j=4;j>=i;j--) {
    			System.out.print(" ");
    		}for(int k=1;k<=i;k++) {
    			System.out.print(" *");
    		}System.out.println();
    	}
    	
    }
//  OutPut: Test7 Method
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
//     * * * * * *
//    * * * * * * *    
    void Test7() {
    	for(int i=1;i<=7;i++) {
    		for(int j=6;j>=i;j--) {
    			System.out.print(" ");
    		}for(int k=1;k<=i;k++) {
    			System.out.print(" *");
    		}System.out.println();
    	}
    }
 
// OutPut: Test8 Method
//    
//    * * * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         * 
    void Test8() {
    	for(int i=1; i<=7;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(" ");
    		}for(int k=6;k>=i;k--) {
    			System.out.print(" *");
    		}System.out.println();
    	}
    }
    
// ************   Numbers Pattern  *****************
// OutPut: Test9 Method 
//    1
//    12
//    123
//    1234
//    12345
    void Test9() {
    	for(int i=1;i<=5;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print( j);
    		}System.out.println();
    	}
    }
//  OutPut: Test10 Method
//    1
//    22
//    333
//    4444
//    55555
    void Test10() {
    	for(int i=1;i<=5;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print( i);
    		}System.out.println();
    	}
    }
//  OutPut: Test11 Method
//    54321
//    5432
//    543
//    54
//    5
    void Test11() {
    	for(int i=1;i<=5;i++) {
    		for(int j=5;j>=i;j--) {
    			System.out.print( j);
    		}System.out.println();
    	}
    }
//  OutPut: Test12 Method  
//    1
//    2 3
//    4 5 6
//    7 8 9 10
    void Test12() {
    	int count =0;
    	for(int i=1;i<=4;i++) {
    		for(int j=1;j<=i;j++) {
    			count+=1;
    			System.out.print(count+" ");
    		}System.out.println();
    	}
    }
//    OutPut: Test13 Method
//    1   2  3 
//    4   5  6 
//    7   8  9 
//    10 11 12 
//    13 14 15 
    void Test13() {
    	int count =0;
    	for(int i=1;i<=5;i++) {
    		for(int j=1;j<=3;j++) {
    			count+=1;
    			System.out.print(count+" ");
    		}System.out.println();
    	}
    }
//  OutPut: Test14 Method 
//    1 
//    2 1 
//    3 2 1 
//    4 3 2 1 
//    5 4 3 2 1 
    void Test14() {
    	for(int i=1;i<=5;i++) {
    		for(int j=1; j<=i;j++) {
    			System.out.print(j+" ");
    		}System.out.println();
    	}
    }
  
//  OutPut: Test15 Method
//    1
//    121
//    12321
//    1234321
//    123454321
    void Test15() { 
    	for (int i = 1; i <= 5; i++) {
            // Print the increasing part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print the decreasing part of the pattern
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }System.out.println();
    	}
    }
    
    void MaxMin() {
   
    }
    public static void main(String[] args) {
		PersanalDetails pd = new PersanalDetails();
//		                pd.Test();
//		                pd.Test1();
//		                pd.Test2();
//		                pd.Test3();
//		                pd.Test4();
//		                pd.Test5();
//		                pd.Test6();
//		                pd.Test7();
//		                pd.Test8();
//		                pd.Test9();
//		                pd.Test10();
//		                pd.Test11();
//		                pd.Test12();
//		                pd.Test13();
		                pd.Test15();
		                
	}
}
