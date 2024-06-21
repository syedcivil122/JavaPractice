package features;

import java.util.Arrays;

public class FindMinMaxNumber {
	public static void main(String[] args) {
		
		int arr[] = {20,30,10,40,80,60,70,50,7};
		
		int min = arr[0];
		int max = arr[0];
		
		Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];

        System.out.println("The second largest number is: " + secondLargest);
    
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}if(max<arr[i]) {
				max = arr[i];
			}
		}System.out.println(min);
		System.out.println(max);
	}
}
