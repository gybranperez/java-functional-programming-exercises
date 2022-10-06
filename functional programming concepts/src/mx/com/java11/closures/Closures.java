package mx.com.java11.closures;

public class Closures {
	// A closure is a function that refers to free variables in its lexical context
	public static void main(String[] args) {
		int val = 111;
		Task lambda = () -> System.out.println(val);
		printValue(lambda);
	}

	private static void printValue(Task lambda) {
		lambda.doTask();
	}

}
