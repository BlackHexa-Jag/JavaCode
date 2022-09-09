package com.code.java.basics;
/**
 * 
 * This is for the complex number, in includes addition, subtraction, multiplication and division
 * @author jag mohan
 * @see	
 *
 */

public class ComplexNo {
	
	private double real; // real part
	private double img; // imaginary part
	
	/**
	 * Constructor for complex no
	 * @param real
	 * @param img
	 * @throws 
	 */
	
	public ComplexNo(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}
	
	public ComplexNo add(ComplexNo c) {

//		double real = this.real + c.real;
//		double img = this.img + c.img;

//		ComplexNo temp = new ComplexNo(real,img);

		return new ComplexNo(this.real + c.real, this.img + c.img);

		//return new ComplexNo(this.real+c.real, this.img+c.img);
	}
	
	public ComplexNo sub(ComplexNo c) {
		
		double real = this.real - c.real;
		double img =  this.img - c.img;
		
		return new ComplexNo(real, img);
	}
	/**
	 * (a+ib)*(c+id) = ac -bd + (bc+ad)i
	 * @param 
	 * @return
	 */
	public ComplexNo  multiplication(ComplexNo c) {
		
		double real = (this.real * c.real)  - (this.img * c.img);
		double img = (this.img * c.real) + (this.real * c.img);
		
		
		return new ComplexNo(real, img);
	}
	/**
	 * 	To divide complex numbers, you must multiply by the conjugate
	 * c = 5+ 3i
	 * conjucate = 5-3i
	 * @param c
	 * @return
	 */
	public ComplexNo division(ComplexNo c) {
		
		if(c.real == 0 && c.img == 0) {
			throw new IllegalArgumentException("Denominator is zero");
		}
		
		ComplexNo conjugate = new ComplexNo(c.real,-c.img);
		
		ComplexNo numerator = this.multiplication(conjugate);
		ComplexNo denominator = c.multiplication(conjugate);
		
		numerator.real = numerator.real / denominator.real;
		numerator.img = numerator.img / denominator.real;
		
				
		return numerator;
		
	}
	/**
	 * 
	 * @return real
	 */
	public double getReal() {
		return real;
	}
	/**
	 * 
	 * @param real
	 */
	public void setReal(double real) {
		
		this.real = real;
	}
	/**
	 * 
	 * @return img
	 */
	public double getImg() {
		return img;
	}
	/**
	 * 
	 * @param img
	 */
	public void setImg(double img) {
		this.img = img;
	}
	/**
	 * toString to print the object
	 */
	@Override
	/*
	 * public String toString() { return "ComplexNo [real=" + real + ", img=" + img
	 * + "]"; }
	 */
	
	public String toString() {
		return "ComplexNo [" + real +" , " + img +"i"+ "]";
	}
	

}
