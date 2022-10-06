package mx.com.java11.composition;

public class Composition {

	public static void main(String[] args) {
		/*  las funciones en cadena son similares a la compoosicion 
			de funciones, la diferencia es que la composición aplica el redireccionamiento en reversa
			a la dirección que usamos para llegar a esta
			
			por ejemplo si tenemos:
				a.compose(b);
			
			la funcion b será ejecutada y despues se hara la funcion a del resultado de esta
			
		*/
		Function<Square, Integer> fun1 = s -> s.getArea();
		Function<Integer, Double> fun2 = area -> Math.sqrt(area);
		
		Function<Square, Double> getSide = fun2.compose(fun1);
		
		Square s = new Square();
		s.setArea(100);
		
		Double side = getSide.apply(s);
		System.out.println(side);
		
	}

}
