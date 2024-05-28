package controlStatement;

public class ControlStatement {
	/** 1) Selection or Conditional statements
	         eg - if, if - else, if-else-if,  nested if
	            - switch
	    2) Iteration or looping Statements
	        eg - for 
	           - while
	           - do.while
	    3) Jump Statements
	        eg - break
	           - continue
	           - return
	           
	     
	    CONDITIONAL STATEMENTS Syntax;
	    
	    - if(condition)       |    if(condition)                |        if(condition) 
	      {                   |     {                           |        {
	        //body            |       //body                    |          if(condition2)
	      }                   |     }                           |           {
	      else                |     else if(condition2)         |             //body
	      {                   |     {                           |            }
	        //body            |      //body                     |        }
	      }                   |      }
	                          |      else if(condition3)
	                          |      {
	                          |        //body
	                          |      }
	                          |      else
	                          |      {
	                          |        //body
	                          |      }
	                          
	                          
	    ---->  Switch: Syntax
	        
	        switch(variable to be tested)
	        {
	            case   value1: 
	                          statements
	                          
	                          break;
	            case  value2:
	                          statements
	                          
	                          break;
	                   '
	                   '
	             default:
	                     statement
	                     break;
	                     
2)  Iteration or looping statements
     - for    - while     -do.while
   --------------------------------------
                int a =1;      a<5;           a++ / a--
   ----> for(initialization; condition; increment/decrement)
           {
             //body
           }
           
           
   ----->  while(condition)       |          ---> do
             {                    |                {
                //body            |                  //body
             }                    |                }while(condition);
                                  |
	
	
	3) Jump statements;
	----------------------   
	    - return    - break       - continue
	 */	
}


//WAP  to find the larger of two numbers	
	class GreaterTwo {
		
		public static void main(String[] args) {
			 
			int a=10, b=20;
			if(a>b) {
				System.out.println("a is greater");
		}else
			System.out.println("b is greater");
			
	}
	}
	

//WAP  to find the larger of three numbers
	
class GreaterThree{
	
	public static void main(String[] args) {
		
		int a=20, b=30, c=40;
		
		if(a>b && a>c) {
			System.out.println("larger vaue1");
		}else if(b>a && b>c) {
		      System.out.println("larger b");
		}else 
			System.out.println("larger c");
		
		
	}
}

class GreaterSix {
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,90};
		
		int largest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		
		System.out.println("the largest number is:"+largest);
		
	}
}
	

