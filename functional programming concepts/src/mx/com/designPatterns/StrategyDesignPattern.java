package mx.com.designPatterns;

import java.util.List;

import mx.com.designPatterns.model.Stock;
import mx.com.designPatterns.model.StockFilters;

public class StrategyDesignPattern {
	/*
	 * The strategy design pattern is used when we have multiple solutions 
	 * or algorithms to solve a specific task... 
	 * and client decides the specific implementation which is to be used at runtime.
	 * 
	 * The best example in jdk itself is the Comparator API the 
	 * sort method takes 2 arguments first the list we're going to sort and the second 
	 * is a Comparator implementation (we can sort in different ways)
	 * Collections.sort(List list, Comparator c)
	 * 
	 */
	public static void main(String[] args) {
		List<Stock> list = List.of(
					new Stock("MSFT", 234.4, 10),
					new Stock("AMAZON", 100.98, 5),
					new Stock("GOOGLE", 60.8, 18),
					new Stock("TSLA", 10, 2),
					new Stock("META", 450.32, 8),
					new Stock("GOOGLE", 160.8, 8),
					new Stock("AMAZON", 800.8, 4)
				);
//		System.out.println("BY SYMBOL");
//		StockFilters.bySymbol(list, "AMAZON").forEach(System.out::println);
//		System.out.println("\nBY PRICE ABOVE");
//		StockFilters.byPriceAbove(list, 200).forEach(System.out::println);
		
		// creamos condicion de evaluacion como segundo parametro
		StockFilters
			.filter(list, stock->stock.getSymbol().equals("AMAZON"))
			.forEach(System.out::println);
		
		System.out.println("\n\n");
		
		StockFilters
		.filter(list, stock->stock.getPrice()>250)
		.forEach(System.out::println);
		
	}
}
