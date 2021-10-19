package Array;

import java.util.Scanner;

public class ExercicioMatriz {
	public static void main(String[] args) {
		/*
		4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
		Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da 
		adição da constante deve ser armazenado na própria matriz.
		 */

			Scanner leia = new Scanner (System.in);
			float[][] matriz1 = new float [2][2];
			float[][] matriz2 = new float [2][2];
			float[][] matriz3 = new float [2][2];
			float[][] matriz4 = new float [2][2];
			float[][] matriz1const = new float [2][2];
			float[][] matriz2const = new float [2][2];
			float constante;
			int opcao;
			
			for (int lin=0; lin<2; lin++) {
				for (int col=0; col<2; col++) {
					System.out.printf("Insira a Matriz 1[%d][%d]: ",lin+1,col+1);
					matriz1[lin][col] = leia.nextFloat();
				}
			}
			
			for (int lin=0; lin<2; lin++) {
				for (int col=0; col<2; col++) {
					System.out.printf("Insira a Matriz 2[%d][%d]: ",lin+1,col+1);
					matriz2[lin][col] = leia.nextFloat();
				}
			}
			
			
			System.out.println("\tEscolha uma opção: ");
			System.out.println("\n(1) Somar a primeira Matriz com a segunda");
			System.out.println("\n(2) Subtrair a primeira Matriz da segunda");
			System.out.println("\n(3) Adicionar uma constatnte as duas Matrizes");
			System.out.println("\n(4) Imprimir Matrizes");
			opcao = leia.nextInt();
			
			if (opcao == 1) {
				for (int lin=0; lin<2; lin++) {
					for (int col=0; col<2; col++) {
						matriz3[lin][col] = matriz1[lin][col] + matriz2[lin][col];
						System.out.printf("\t %f \t",matriz3[lin][col]);
					}
				}
			}
			
			else if (opcao == 2) {
				for (int lin=0; lin<2; lin++) {
					for (int col=0; col<2; col++) {
						matriz4[lin][col] = matriz1[lin][col] - matriz2[lin][col];
						System.out.printf("\t %f \t",matriz4[lin][col]);
					}
				}
			}
			
			else if (opcao == 3) {
				System.out.println("Digite a constante que deseja adicionar as matrizes: ");
				constante = leia.nextFloat();
				for (int lin=0; lin<2; lin++) {
					for (int col=0; col<2; col++) {
						matriz1const[lin][col] = matriz1[lin][col] + constante;
						matriz2const[lin][col] = matriz2[lin][col] + constante;
						System.out.printf("\t %f \t",matriz1const[lin][col]);
						System.out.printf("\t %f \t",matriz2const[lin][col]);
						
					}
				}
			}
			
			else if (opcao == 4) {
				for (int lin=0; lin<2; lin++) {
					for (int col=0; col<2; col++) {
						System.out.printf("\t %f \t",matriz1[lin][col]);
						System.out.printf("\t %f \t",matriz2[lin][col]);
					}
				}
			}
			
			else {
				System.out.println("Opção inválida");
			}
		}

	}
