package LacosDeRepeticaoDoWhile;

import java.util.Scanner;
/* Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o 
 * número zero seja digitado. Ao final, mostre na tela a média de todos os números 
 * digitados, que sejam múltiplos de 3.
 * 
 * 		Na construção do Algoritmo, utilize os seguintes conteúdos:
 *  	Entrada e Saída de dados
 *  	Operadores
 *  	Laços Condicionais
 *  	Laço de Repetição DO...WHILE
 */

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 0;
		double media, soma = 0; 
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Insira um valor: ");
			num1 = scanner.nextInt();
			
			if (num1 % 3 == 0 && num1 > 0) {
				soma += num1; // soma = soma + num. Ou seja, oque estiver guardado em num será somado em "soma"
				num2 ++;
			} 			
		} while(num1 != 0);
		
		media = soma / num2;
		System.out.print("Os números múltiplos de três é igual a: "+media);
	}
}
