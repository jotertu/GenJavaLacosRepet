package LacoDeRepeticaoWhile;

import java.util.Scanner;
/*
 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos
 * e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve
 * ser finalizada ao digitar uma idade negativa.
 * 
 * 	Na construção do Algoritmo, utilize os seguintes conteúdos:
 * 		Entrada e Saída de dados
 * 		Operadores
 * 		Laços Condicionais
 * 		Laço de Repetição WHILE
 */
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, menores = 0, maiores = 0;
		
		Scanner scanner = new Scanner(System.in);	
		
		while (idade >= 0) {
			System.out.print("Insira a sua idade: ");
			idade = scanner.nextInt();
			if (idade < 21 && idade >= 0) {
				menores ++;
			} else if (idade > 50) {
				maiores++;
			} else if (idade < 0) {
				System.out.print("Numero negativo digitado.");
			}
		}
		System.out.println("O total de menores de 21 anos é de: "+menores);
		System.out.println("O total de maiores de 50 anos é de: "+maiores);
	}
}
