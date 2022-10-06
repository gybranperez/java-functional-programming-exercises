package mx.com.java8.threads;

public class LambdaExample2 {
	 public static void main(String[] args) {
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread executed 2");
			}

		});
		t.start();
	 }
}
