package Colletion;

import java.util.ArrayList;
import java.util.Scanner;

public class GreenDog {
		
	public static void main(String[] args) {
			
		//Inserindo variáveis
		
		int op;
		
		//Instanciando objetos
		
			try (Scanner ler = new Scanner(System.in)){
				
			ArrayList<String> estoque = new ArrayList<String>();
		
		// Colocando a mão na massa
				do {
					
					System.out.println("\n************* ESTOQUE DA LOJA GREEN DOG *******************");
					System.out.println("            Digite uma opção para começar: "         );
					System.out.println("-------------------------------------------------------");
					System.out.println("1 - Adicionar novos modelos de bolsas ao estoque\n2 - Remover algum modelo do estoque\n3 - Atualizar algum modelo de bolsa \n4 - Visualizar todos os modelos de bolsas do estoque\n0 - Encerrar o programa");
					System.out.println("-------------------------------------------------------");
					op = ler.nextInt();
					
					//colocar um if ou case depois que contabilize a entrada e retirada em questão de quantidade de bolsas vai ter no estoque
					
						if (op ==1 ) {
					
				
							ler.nextLine();
							System.out.println("Digite, por favor, o nome do novo modelo de bolsa para inserir ao estoque: ");
							String bolsa = ler.nextLine();
					
							estoque.add(bolsa);
							System.out.println("*" + bolsa + " adicionado(s) com sucesso!*");
					
					}
					
					
						else if(op == 2) {
					
							ler.nextLine();
							System.out.println("Digite, por favor, o modelo de bolsa para remove-lo do estoque: ");
							String bolsa1 = ler.nextLine();
						
								if(estoque.contains(bolsa1)) {
							
									estoque.remove(bolsa1);
						
								} else {
							
									System.out.println("Bolsa não encontrada no estoque");
								}
						}
						
						else if(op == 3) {
		
						
							ler.nextLine();
							System.out.println("Digite, por favor, o modelo de bolsa que você deseja atualizar: ");
							String verifica = ler.nextLine();
							System.out.println("Digite o modelo de bolsa que entrará no lugar do " +verifica+".");
							String novo = ler.nextLine();
					
								if(estoque.contains(verifica)){
							
									estoque.remove(verifica);
									estoque.add(novo);
							
								} else {
							
									System.out.println("Modelo de bolsa não encontrado no estoque!");
							
								}
								
						} else if (op == 4){
							
						
							ler.nextLine();
							System.out.println("Temos estes modelos de bolsas disponíveis no estoque: ");
							System.out.println(estoque);
							
						} else {
							
							System.out.println("Obrigada por ter atualizado o estoque da loja, programa finalizado!");
						}
				
				} while(op!=0);	
			}
		}
	}
