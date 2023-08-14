package LacoDeRepeticaoFor;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na 
 * tela quantos números são pares e quantos número são ímpares.
 * 
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Operadores
 * 		Laços Condicionais
 * 		Laço de Repetição FOR
 */
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num, contaPar = 0, contaImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			num = scanner.nextInt();
			if(num % 2 == 0) {
				contaPar++;
			}
			
			if(num % 2 != 0) {
				contaImpar++;
			}
		}
		System.out.println("Foram digitados: "+contaPar+" números pares");
		System.out.println("Foram digitados: "+contaImpar+" números impares");
	}
}
