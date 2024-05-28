package array;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; //Jagged Array
		arr[0] = new int[2];
		arr[1] = new int[5];
		arr[2] = new int[3];
		
		arr[0][0] =1;
		arr[0][1] =2;
		
		arr[1][0] =3;
		arr[1][1] =9;
		arr[1][2] =14;
		arr[1][3] =28;
		arr[1][4] =15;
		
		arr[2][0] =2;
		arr[2][1] =10;
		arr[2][2] =5;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

//	 jagged array formating another way
		
		int[][] arr1 = {
				{1,2,3},
				{4,6,8,12,43,65},
				{7,9}
		};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
