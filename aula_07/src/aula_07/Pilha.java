package aula_07;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunica��o n�o Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Di�rio de um Banana");
		pilha.add("Senhor dos An�is");
		pilha.add("O C�digo Da Vinci");

		
		System.out.println(pilha);
		
		//Remove um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		pilha.push("A Torre Negra");
		
		System.out.println(pilha);
		
		
	}
}
