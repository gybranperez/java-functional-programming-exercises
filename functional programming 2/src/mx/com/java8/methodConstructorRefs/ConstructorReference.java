package mx.com.java8.methodConstructorRefs;

import java.util.function.Function;

public class ConstructorReference {
	/*
		Class :: new
		Referencia a constructor de una clase
	*/
	public static void main(String[] args) {
		//Function<Runnable, Thread> threadGenerator =  r -> new Thread(r);
		Function<Runnable, Thread> threadGenerator =  Thread :: new;
		
		Runnable task1 = () -> System.out.println("task 1 executed");
		Runnable task2 = () -> System.out.println("task 2 executed");
		
		Thread t1 = threadGenerator.apply(task1);
		Thread t2 = threadGenerator.apply(task2);
		
		t1.start();
		t2.start();
		
		threadGenerator.apply(() -> System.out.println("Task 3 executed")).start();
	}

}
