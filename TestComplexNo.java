package com.code.java.basics;

public class TestComplexNo {
	
	public static void main(String[] args) {
		String str = new String();
		ComplexNo c1 = new ComplexNo(3.0, 2.0);
		
		ComplexNo c2 = new ComplexNo(1.0,7.0);
		
		System.out.println("Printing Complex Nos.");
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println("Addition");
//		System.out.println(c1.add(c2));
//		
//		ComplexNo subResult = c1.sub(c2);
//		System.out.println("Substration");
//		System.out.println(subResult);
//		
//		System.out.println("Multiplication");
		
//		System.out.println(c1.multiplication(c2));
		/**
		 * http://www.mesacc.edu/~scotz47781/mat120/notes/complex/dividing/dividing_complex.html#:~:text=To%20divide%20complex%20numbers%2C%20you,denominator%20to%20remove%20the%20parenthesis.
		 */
		
		
		
		ComplexNo x = new ComplexNo(3,2);
		ComplexNo y = new ComplexNo(4,-3);
		
		System.out.println("Division of x = "+x +" and y = "+y);
		System.out.println(x.division(y));
		
		ComplexNo a = new ComplexNo(4,5);
		ComplexNo b = new ComplexNo(2,6);
		System.out.println(a.division(b));
		
		
	}

}
