package array;

public class SingleArray {
	public static void main(String[] args) {

	int a [] = new int [8];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	a[5] = 60;
	a[6] = 70;
	a[7] =80;
	System.out.println(a[0]);
	System.out.println(a[4]);
	System.out.println(a[1]);
	System.out.println(a[6]);
	System.out.println(a[2]);
	System.out.println(a[5]);
	System.out.println(a[3]);
	System.out.println(a[7]);
	System.out.println(a.length);
	System.out.println(a.length-1);
	System.out.println(a.hashCode());
	
	int ar [] = {2,3,4,5,7,8,9,7,5,4,2}; // single array
	  for(int i=0;i<ar.length;i++) {  // for loop
		  System.out.println(ar[i]);
	  }System.out.println("for each loop: ");
	  for(int arr:ar) {  // for each
		  System.out.println(arr);
	  }
	  System.out.println("while loop");int i =0;
	  while(i<ar.length) {
		  System.out.println(ar[i]);
		  i++;
	  }
	  
	  int l =0;
	  while(l<ar.length) {
		  System.out.println(ar[l]);
		  l++;
	  }
	  
	  double dl []= {12.43,43.23,65.54,76.87,43.87,21.32};
	  for(int b=0;b<dl.length;b++) {
		  System.out.println(dl[b]);
	  }System.out.println("for each loop: ");
	  for(double da:dl) {
		  System.out.println(da);
	  }
	  int m =0;
	  while(m<dl.length) {
		  System.out.println(dl[m]);
		  m++;
	  }
//	  
	  char c [] = new char[7];
	  c[0] ='a';
	  c[1] = 'b';
	  c[2] = 'c';
	  c[3] = 'd';
	  c[4] = 'e';
	  c[5] = 'f';
	  c[6] = 'g';
	  System.out.println(c[0]);
		System.out.println(c[4]);
		System.out.println(c[1]);
		System.out.println(c[6]);
		System.out.println(c[2]);
		System.out.println(c[5]);
		System.out.println(c[3]);
		System.out.println(c.length);
		
		char[] ca = {'S','Y','E','D','A','R','I','F'};
		for(i=0;i<ca.length;i++) {
			System.out.println(ca[i]);
		}System.out.println("for each: ");
		for(char carr:ca){
			System.out.println(carr);
		}
	     int j =0;
	     while(j<ca.length) {
	    	 System.out.println(ca[j]);
	    	 j++;
	     }
	     
	    String S1 = new String(ca);
	    System.out.println("coverting to string "+S1);
	     
	     String S [] = {"ABC","DEF","GHG","KLM","qwe","1234","Apple"};
	    
		 System.out.println(S[0]);
		System.out.println(S[4]);
		System.out.println(S[1]);
		System.out.println(S[6]);
		System.out.println(S[2]);
		System.out.println(S[5]);
		System.out.println(S[3]);
		System.out.println(S.length);
	     for(i=0;i<S.length;i++) {
	    	 System.out.println(S[i]);
	     }System.out.println("for each ");
	     for(String sr:S) {
	    	 System.out.println(sr);
	     }
	    int k=0;
	     while(k<S.length) {
	    	 System.out.println(S[k]);
	    	 k++;
	     }
	     
	}

	

}
