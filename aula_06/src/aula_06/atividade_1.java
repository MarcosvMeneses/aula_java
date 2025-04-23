package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {
        // Criando o ArrayList para armazenar as cores
        ArrayList<String> cores = new ArrayList<>();
        
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que digite 5 cores
        System.out.println("Digite 5 cores:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor); // Adicionando cada cor ao ArrayList
        }
        
        // Mostrando todas as cores adicionadas
        System.out.println("\nLista de todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        
        // Ordenando as cores em ordem crescente
        Collections.sort(cores);
        
        // Mostrando as cores ordenadas
        System.out.println("\nLista de cores ordenadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        
        // Fechando o scanner
        scanner.close();
    }
}