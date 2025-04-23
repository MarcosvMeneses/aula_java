package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoArrayList {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//criando coleção ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		

		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
//		System.out.println("Digite um número real: ");
//		double input = scanner.nextDouble();
		
//		numeros.add(input);
		
		//listando os valores da coleção ArrayList
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		//busca a posição
		System.out.println("Indice do número 9.0 :" + numeros.indexOf(9.0));
		
		// verificando se o elemento existe
		System.out.println("O número 9.0 existe na coleção? :" + numeros.contains(9.0));
		
		//verificando valor do item na posição escolhida
		System.out.println("Qual valor está armazenado no indice 2? :" + numeros.get(2));
		
		//alterar o valor do elemento
		numeros.set(2, 10.0);
		
		//Monstrar os dados atualizados via forEach | os :: sao uma forma simplificada de escrever o foreach
		System.out.println("Exibe os dados após a atualização");
		numeros.forEach(System.out::println);
		
		//Excluir um elemento da lista baseado no indice
		numeros.remove(2);
		
		//Monstrar os dados atualizados via forEach | os :: sao uma forma simplificada de escrever o foreach
		System.out.println("Exibe os dados após a exclusão");
		numeros.forEach(System.out::println);
		
		
		//verifica o numero de elementos na coleção
		System.out.println("Qual é o tamanho da Coleção? " + numeros.size());
		
		//limpar a coleção
		//numeros.clear();
		
		//verifica se existe dados na coleção
		System.out.println("A coleção esta vazia?? " + numeros.isEmpty());
				
		//ordenar coleção
		numeros.sort(null);
		
		System.out.println("Exibir os números em ordem crescente");
		numeros.forEach(System.out::println);
	
		scanner.close();
	}

}
