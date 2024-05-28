package Programs;

// for-each loop works in arrays or collections

public class ForEachLoop {
	public static void main(String[] args) {
		int[] arr = {1,3,4,6,8,9,2,1}; // single dimentional array
		
//		for(int i=0; i<arr.length; i++) {//using for loop
//			System.out.println(arr[i]);
//		}
//      
//		for-each loop
//		
//		for(int value:arr) {// for-each loop
//			System.out.println(value);
//		}
		
//		sum the values
		
//		int sum =0;
//		for(int value:arr) {// add the values using for-each loop
//			sum += value;
//		}
//		System.out.println(sum);
//		System.out.println(sum/arr.length);
//		
		
// Multi Dimentional Array
		int[][] ar = { // multi dimentional array
				{1,2,5},
				{4,8,9},
				{7,8,9}
		};
		int sum1 = 0;
		int noOfElements = 0;
		
		for(int[] singleDimArr:ar) {
			for(int value:singleDimArr) {
			System.out.print(value);
			sum1 += value;
			noOfElements++;
			}
			System.out.println();
		}
		System.out.println("sum: "+sum1);// sum the value
		System.out.println("average val: "+noOfElements);// avaerage 
		
		System.out.println();
		
//		Jagged Array 
		
		int[][] ar1 = { // Jagged array
				{1,2,5},
				{4},
				{7,8}
		};
		int sum2 = 0;
		int noOfElements1 = 0;
		
		for(int[] singleDimArr:ar1) {
			for(int value:singleDimArr) {
			System.out.print(value);
			sum2 += value;
			noOfElements1++;
			}
			System.out.println();
		}
		System.out.println("sum: "+sum2);// sum the value
		System.out.println("average val: "+noOfElements1);// avaerage 

	}

}
