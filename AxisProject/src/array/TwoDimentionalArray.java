package array;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		arr[2][0] = 5;
		arr[2][1] = 6;
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
		
//		for(int i=0; i<arr.length; i++) {
//			int[] singleRow = arr[i];
//			for(int j=0; j<singleRow.length; j++) {
//				System.out.print(singleRow[j]+ " ");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++ ) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
//		find elements rows size
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].length);
//		}
//		
//		elements size
		int size =0;
		for(int i=0; i<arr.length; i++) {
			size += arr[i].length;
		}
		System.out.println(size);// no.of elements 6
	}
	

}
