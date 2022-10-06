package mx.com.java11;

public class HigherOrderFunctions {
	/*
	  Higher Order Functions

		  Las funciones de orden superior son funciones que ya sea
		  - reciben funciones o lambdas como parametros
		  - producen funciones o lambdas como respuesta
		  - o ambas
	   
	   En java se implementan funciones usando LAMBDAS
	   
	   
	   
	 * */
	public static void main(String[] args) {
		IFactory<Integer> createFacto = createFactory(() -> Math.random()*100, r->r.intValue());
		Integer product = createFacto.create();
		System.out.println(product);
	}
	// The final value that the configurator returns is an R value
	// so we put IFactory<R>
	public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator){
		return () -> {
			T product = producer.produce();
			return configurator.configure(product);
		};
	}
	
}
