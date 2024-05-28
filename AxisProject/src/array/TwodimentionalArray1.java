package array;

public class TwodimentionalArray1 {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2},{3,4},{5,6}};//overall array
		
//		elements size
//		int size =0;
//		for(int i=0; i<arr.length; i++) {
//			size += arr[i].length;
//		}
//		System.out.println(size);// no.of elements 6
//		
//		for(int i=0; i<arr.length; i++) {// rows and columns elements
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		
//		int[][] arr1 = new int[3][2];// another way
//		arr1[0] = new int[] {1,2};
//		arr1[1] = new int[] {3,4};
//		arr1[2] = new int[] {5,6};
//		
//		for(int i=0; i<arr1.length; i++) {// rows and columns elements
//			for(int j=0; j<arr1[i].length; j++) {
//				System.out.print(arr1[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		int[][] arr2 = { // two dimentional array another way format
				{1,2},
				{3,4},
				{5,6}
		};
		
		for(int i=0; i<arr2.length; i++) {// rows and columns elements
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
		}
		
	}


