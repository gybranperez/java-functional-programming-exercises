package mx.com.java11.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Groups {

	public static void main(String[] args) {
		
		List<String> loquemandan = Stream.of("1100","1110","0110","0001").collect(Collectors.toList());
		Integer matrizLimpia[][] = new Integer[loquemandan.size()][loquemandan.size()] ;
		for (int i = 0; i < loquemandan.size(); i++) {
			String renglon = loquemandan.get(i);
			for (int j = 0; j < renglon.length(); j++) {
				matrizLimpia[i][j] =  Character.getNumericValue(renglon.charAt(j)) ;
			}
		}
		/*
		for (int i = 0; i < matrizLimpia.length; i++) {
			
			for (int j = 0; j < matrizLimpia.length; j++) {
				System.out.print (matrizLimpia[i][j] + " ");
			}
			System.out.println("");
			
		}
		*/
		List<String> grupo = new ArrayList<String>();
		
		for (int i = 0; i < matrizLimpia.length; i++) {
			for (int j = 0; j < matrizLimpia.length; j++) {
				if(matrizLimpia[i][j] == 1) {
					boolean bandera = false;
					for (int j2 = 0; j2 < grupo.size(); j2++) {
						String elemento = grupo.get(j2);

						System.out.println(elemento);
						String aux = elemento;
						if(elemento.indexOf(Integer.toString(i))!=-1) {							
							grupo.set(grupo.indexOf(elemento), elemento.concat(Integer.toString(j))) ;
							bandera = true;
						}	
					}
					if(bandera==false) grupo.add(Integer.toString(i));
				}
			}
		}
		
		System.out.println(grupo);
		System.out.println(grupo.size());
		
		
	}

}
