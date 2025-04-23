package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoArrayList {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//criando cole��o ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		

		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
//		System.out.println("Digite um n�mero real: ");
//		double input = scanner.nextDouble();
		
//		numeros.add(input);
		
		//listando os valores da cole��o ArrayList
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		//busca a posi��o
		System.out.println("Indice do n�mero 9.0 :" + numeros.indexOf(9.0));
		
		// verificando se o elemento existe
		System.out.println("O n�mero 9.0 existe na cole��o? :" + numeros.contains(9.0));
		
		//verificando valor do item na posi��o escolhida
		System.out.println("Qual valor est� armazenado no indice 2? :" + numeros.get(2));
		
		//alterar o valor do elemento
		numeros.set(2, 10.0);
		
		//Monstrar os dados atualizados via forEach | os :: sao uma forma simplificada de escrever o foreach
		System.out.println("Exibe os dados ap�s a atualiza��o");
		numeros.forEach(System.out::println);
		
		//Excluir um elemento da lista baseado no indice
		numeros.remove(2);
		
		//Monstrar os dados atualizados via forEach | os :: sao uma forma simplificada de escrever o foreach
		System.out.println("Exibe os dados ap�s a exclus�o");
		numeros.forEach(System.out::println);
		
		
		//verifica o numero de elementos na cole��o
		System.out.println("Qual � o tamanho da Cole��o? " + numeros.size());
		
		//limpar a cole��o
		//numeros.clear();
		
		//verifica se existe dados na cole��o
		System.out.println("A cole��o esta vazia?? " + numeros.isEmpty());
				
		//ordenar cole��o
		numeros.sort(null);
		
		System.out.println("Exibir os n�meros em ordem crescente");
		numeros.forEach(System.out::println);
	
		scanner.close();
	}

}
