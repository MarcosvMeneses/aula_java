package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

public class ColecaoSet {
	
	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Banana");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		System.out.println("Morando existe na coleção? " + frutas.contains("Morango"));
		
		// remove elemento da coleção
		frutas.remove("Morango");
		
		//crar um iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		//listar os dados após a exclusão de um elemento
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//adicionados os itens da coleção set frutas
		// na coleção ArrayList (frutasList)
		frutasList.addAll(frutas);
		
		//feita ordenação
		frutasList.sort(String.CASE_INSENSITIVE_ORDER);
		
		//exibido em ordem crescente
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);
	}

}
