package TRY_CATCH;

public class FINALLY {
	public static void main(String args[]) {
	      try{  
	    	  int num=121/0;  
	    	  System.out.println(num);  
	      }  
	      catch(ArithmeticException e){
	         System.out.println("ERROR : " + e.getMessage());
	      }  
	      /* Finally block sẽ luôn được thực thi
	       * dù có exception hay không
	       */
	      finally{
	    	  	System.out.println("Đây là finally block");
	      }  
	      		System.out.println("Ra khỏi try-catch-finally");  
	   }   
}
