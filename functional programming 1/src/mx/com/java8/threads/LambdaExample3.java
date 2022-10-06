package mx.com.java8.threads;

public class LambdaExample3 {
	 public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("ESO"));
		t.start();
	 }
}
