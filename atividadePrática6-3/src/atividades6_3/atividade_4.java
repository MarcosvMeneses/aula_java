package atividades6_3;

import java.util.Scanner;

public class atividade_4 {
	
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		n1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo n�mero");
		n2 = scanner.nextFloat();
		
		System.out.println("Digite o terceiro n�mero");
		n3 = scanner.nextFloat();
		
		System.out.println("Digite o quarto n�mero");
		n4 = scanner.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferen�a �: " + diferenca);
		
		scanner.close();
	}
}
