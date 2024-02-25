package TRY_CATCH;

import java.util.Scanner;

public class THROW {
	private static double divide(double num1 , double num2) throws ArithmeticException {
		if(num2 == 0) {
			ArithmeticException ex = new ArithmeticException("/by zero");
			throw ex;
		}else {
			return (double) num1/num2;
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(divide(12,0));
		}catch (ArithmeticException e){
			System.out.println("Error: " + e.toString());
		}
	}
}
