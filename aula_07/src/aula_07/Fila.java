package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		//Cria estrutura de dados
		Queue<String> fila = new LinkedList<String>();
		
		//Adicionando dados a fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		
		fila.add("Thiago");
		
		System.out.println(fila);
		
		//O peek mostra o head da fila
		System.out.println(fila.peek());
		
		//Mostra o head e o remove
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		//Contains verifica se o dado usado como parametro existe na fila
		System.out.println("A Maria está na fila? " + fila.contains("Maria"));
		System.out.println("O Carlos está na fila? " + fila.contains("Carlos"));

		
		fila.add("Iago");
		
		System.out.println("Qual o tamanho da fila? " + fila.size());
		
			
		}
			
		
}
 