package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_1 {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int tamanhoLinha = 40;
		int opcao;
		String nome;
		
		do {

			System.out.printf("%s\n", "*".repeat(tamanhoLinha));
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair\n");
			System.out.printf("%s\n", "*".repeat(tamanhoLinha));
			System.out.println("Entre com a opção desejada");
			opcao = Integer.parseInt(scanner.nextLine());

			switch(opcao){
				case 1 :
					System.out.println("Digite o nome do Cliente");
					nome = scanner.nextLine();

					fila.add(nome);

					System.out.println(nome + " foi adicionado à fila!");

					break;
				
				case 2 :

					if(fila.isEmpty())System.out.println("A fila está vazia.");

					else System.out.println(fila);

					break;

				case 3 :

					fila.remove();

					break;

				case 0 :

					System.out.println("Finalizando programa.");
					break;

				default :

					System.out.println("Opção invalida.");
			}

		} while(opcao != 0);
		scanner.close();
		return;
	}
}
