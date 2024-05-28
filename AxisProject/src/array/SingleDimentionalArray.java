package array;

public class SingleDimentionalArray {

	public static void main(String[] args) {
	/*	Single Dimentonal Array(X-axis)
	 *  Different ways of initializing single-dimentional array
	 *  
	 *  int[] j = {12,15,23,65,32}; // initializing the array values(this is 1st way)
		int[] j = new int [] {1,3,5,6,8,9,10}; //initializing the array value(this is 2nd way)
		
	*	int[] j; declaration or define
	*	j = new int [] {12,43,23,76,87}; initializing
	
	*	int[] j = new int[] {4,23,13,34};
	*/
		int[] j = new int[5];// we mention the array size
		System.out.println(j.length);// Array length 
		System.out.println(j.length-1);// Array index size
		j[0]=5;
		j[2]=8;//assign
		j[4]=45;
		
		j[2]=34;//resign or override
		j[2]=36;//resign the value 
//		j[5]=40;	out-off index error
		
		for(int i=0;i<j.length; i++) { //using for loop
			System.out.println(j[i]);
		}
		
		System.out.println(j[0]+ j[1] +j[2] + j[3]+ j[4]);// this way only for 4 values consider(2 values that time we got expection error)
		
//		int i=0;
//		while(i<j.length) {//using  while loop
//			System.out.println(j[i]);
//			i++;
//		}
	}
}
