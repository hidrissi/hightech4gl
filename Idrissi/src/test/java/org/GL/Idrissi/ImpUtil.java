package org.GL.Idrissi;


public class ImpUtil implements util {
	
	 int a = 0;

	public double prod(double x, double y) {
		return x*y;
	}

	
	
	public double div(double x, double y) {
		if (y==0)
			throw new ArithmeticException("/ by zero");
		else
		return x/y;
	}

	
	public double addition(double x, double y) {
		return x+y;
	}

	
	
	public double soustr(double x, double y) {
		return x-y;
	}

	
	public int PGCD(int a, int b) {
		while (a != b) {         
			if (a < b)            
				b = b - a;        
			else            
				a = a - b;      
			}      return a;
	}

	
	
	public int Fact(int a) {
		if (a<0)
			throw new IllegalArgumentException(" negative number for factoriel");
		else if (a==0) return(1);		
	    else return(a*Fact(a-1));	}

	
	public String bin(int a) {
		return Integer.toBinaryString(a);
	}
	
	
	public boolean estPair(int a) {
		if (a%2 == 0)
			return true;
		else 
			return false;
	}

	
	public int repeatInt () {
		return a++;
	}
	
	

}
