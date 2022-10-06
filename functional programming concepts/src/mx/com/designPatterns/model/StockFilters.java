package mx.com.designPatterns.model;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StockFilters {
//	public static List<Stock> bySymbol(List<Stock> list, String symbol){
//		return list.stream().filter(s -> s.getSymbol().equals(symbol)).collect(Collectors.toList());
//	}
//	public static List<Stock> byPriceAbove(List<Stock> list, double price){
//		return list.stream().filter(s -> price<s.getPrice()).collect(Collectors.toList());
//	}
	/*
		En vez de seguir declarando muuuuchos casos de filtro, 
		podemos generar uno generico que reciba un predicate con una lambda function como parametro
	*/
	public static List<Stock> filter(List<Stock> list, Predicate<Stock> p){
		return list.stream().filter(p).collect(Collectors.toList()); 
	}
	
}
