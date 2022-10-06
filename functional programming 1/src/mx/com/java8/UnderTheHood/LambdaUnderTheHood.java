package mx.com.java8.UnderTheHood;

import mx.com.java8.functionalInterfaces.MyFunctionalInterface;

public class LambdaUnderTheHood {

	public static void main(String[] args) {
		
//		MyFunctionalInterface fun1 = new MyFunctionalInterface() {
//			@Override
//			public void myMethod() { System.out.println("IMPL 1");}
//		};
//		
//		MyFunctionalInterface fun2 = new MyFunctionalInterface() {
//			@Override
//			public void myMethod() { System.out.println("IMPL 2");}
//		};
		// Lambdas Type Inference and InvokeDynamic
		MyFunctionalInterface fun = () -> System.out.println("IMPL 2"); 
		fun.myMethod();
	}
	

}
