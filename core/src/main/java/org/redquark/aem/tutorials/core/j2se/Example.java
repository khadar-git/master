package org.redquark.aem.tutorials.core.j2se;

public class Example {

	public static void main(String[] args) {
		
		int n=multiply(); // method calling 
		System.out.println("returned value from multiply() :: " + n);
		
		String s=myString();
		System.out.println("returned value from myString() :: " + s);
		int x=10;
		int y =10;
		myMethod(x,y);// method parameters 
		myMethod(100,200);
		int xyz=myMethod1(1,2);

	}

private static void myMethod(int x, int y) {
	
	int z=x+y;
	
	System.out.println("inside  :: " + z);
	
	}

private static int myMethod1(int x, int y) {
	
	int z=x+y;
	
	System.out.println("inside  :: " + z);	
	
	return z;
	}



private static String myString() {
		
	String str="Hello World";
	
	return str.toUpperCase();
		
	}



// Method defination
private static int multiply() {
	int x=15;
	int y =20;
	
	int z=x*y;
	
	return z;
	
}


}
