package LacosDeRepeticaoDoWhile;

import java.util.Scanner;

/*
 *Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o 
 *número zero seja digitado. Ao final, mostre na tela a soma de todos os números
 *digitados, que sejam positivos. Veja o exemplo abaixo:
 *	
 *	   Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 	   Operadores
 * 	   Laços Condicionais
 * 	   Laço de Repetição DO...WHILE
 */

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0, num;
		
		Scanner scanner = new Scanner(System.in);
				
		do {
			System.out.print("Insira um valor: ");
			num = scanner.nextInt();
			
			if (num > 0) {
				soma += num; // soma = soma + num. Ou seja, oque estiver guardado em num será somado em "soma"
			}
			
		} while(num != 0);
		System.out.println("A soma dos números positivos é de: "+soma);
	}

}
