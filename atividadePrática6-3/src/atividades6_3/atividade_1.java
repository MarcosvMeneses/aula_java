package atividades6_3;

import java.util.Scanner;

public class atividade_1 {
	
	public static void main(String[] args) {
		
		float salario = 0, abono = 0, novoSalario = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o sal�rio");
		salario = scanner.nextFloat();

		System.out.println("Digite o abono");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		//salario = 10000 e abono = 1000
		
		System.out.println("Seu novo sal�rio � " + novoSalario);
		
		scanner.close();
	}

}
