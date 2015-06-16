package net.franckbenault.junit;

public class Calculator {

	public double squareRoot(int x) throws IllegalArgumentException {
		
		if(x<0) {
			throw new IllegalArgumentException("Could not calculate the squareRoot of a negative number");
			
		} else {
			return Math.sqrt(x);
		}
	}
	
	public double divide(int x, int y) throws IllegalArgumentException {
		
		if(y==0) {
			throw new IllegalArgumentException("Could not divide by 0");
			
		} else {
			return x/y;
		}
	}
}
