package com.valtech.training.day2;

public class Arithmeticimpl implements Arithmetic {

	@Override
	public int add(int a, int b) {

		return a+b;
	}

	@Override
	public int sub(int a, int b) {

		return a-b;
	}

	@Override
	public int mul(int a, int b) {

		return a*b;
	}

	@Override
	public int div(int a, int b) throws DivideByZeroException{

		if(b == 0) {
			
			throw new DivideByZeroException("Zero cannot be used as Denominator");
		}
		return a/b;
	
	}
	
	public static void main(String[] args){
		
		Arithmetic a = new Arithmeticimpl();
		System.out.println(a.add(2,3));
		System.out.println(a.sub(2,3));
		System.out.println(a.mul(2,3));
		try {
			
			System.out.println(a.div(5,0));
		
		}
		catch (DivideByZeroException e) 
		{

			System.out.println(e.getMessage());
		}
		finally{
			
			System.out.println("Seen Always");
			
		}
	}

}