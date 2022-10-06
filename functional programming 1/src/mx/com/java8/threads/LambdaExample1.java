package mx.com.java8.threads;

public class LambdaExample1 {
	 public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread t = new Thread(runnable);
		t.start();
	 }
}
