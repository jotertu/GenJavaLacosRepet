package LacoDeRepeticaoWhile;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da 
 * área de Desenvolvimento e precisam de um sistema para analisar os dados. Escreva
 * um algoritmo em Java, que leia via teclado as seguintes informações de cada 
 * colaborador:
 * 		Idade (Número inteiro)
 * 		Sexo (Número Inteiro): 
 * 			1 – Masculino
 * 			2 – Feminino
 *			3 - Outros
 *		Categoria (Número Inteiro):
 *			1 – Backend
 *			2 – Frontend
 *			3 – Mobile
 * 			4 – FullStack
 * Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja 
 * continuar a leitura dos dados de um novo colaboradore ou não (S/N). Caso seja 
 * pressionada a tecla N, mostre na tela:
 * 
 * 		    O número de pessoas desenvolvedoras Backend
 * 			O número de mulheres desenvolvedoras Frontend
 * 			O número de homens desenvolvedores Mobile maiores de 40 anos
 * 			O número de mulheres desenvolvedoras FullStack menores de 30 anos
 * 
 *Na construção do Algoritmo, utilize os seguintes conteúdos:
 *
 *			Entrada e Saída de dados
 *			Operadores
 *			Laços Condicionais
 *			Laço de Repetição WHILE
 */
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, sexo, categoria, devBackEnd = 0, mulheresFrontEnd = 0, devMobileHomensMaiores = 0, devMobileMulheresMenores = 0;
		char continuar = 'S';
		
		Scanner scanner = new Scanner(System.in);
            
		while (continuar == 'S' || continuar == 's') { 
			
			System.out.print("Insira a sua idade: ");
	        idade = scanner.nextInt();
			
	        System.out.print("Insira o seu sexo: ");
	        sexo = scanner.nextInt();

	        System.out.print("Insira a categoria: ");
	        categoria = scanner.nextInt();
	        
	        if (categoria == 1) {
	        	devBackEnd++;
	        } 
	        
	        if (categoria == 2 && sexo == 2) {
	        	mulheresFrontEnd++;
	        }
	        
	        if (categoria == 1 && categoria == 3 && idade > 40) {
	        	devMobileHomensMaiores = 0;
	        }
	        
	        if (sexo == 2 && categoria == 4 && idade < 30) {
	        	devMobileMulheresMenores++;
	        }
	        
	        System.out.print("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
	        continuar = scanner.next().charAt(0);
		}
		System.out.println("\nResultados da pesquisa:");
        System.out.println("Número de pessoas desenvolvedoras Backend: " + devBackEnd);
        System.out.println("Número de mulheres desenvolvedoras Frontend: " + mulheresFrontEnd);
        System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + devMobileHomensMaiores);
        System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + devMobileMulheresMenores);
	}
}
