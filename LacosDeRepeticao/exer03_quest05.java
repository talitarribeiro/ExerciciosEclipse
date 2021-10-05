package LacosDeRepeticao;

import java.util.Scanner;

public class exer03_quest05 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int numero,soma=0;

			try (Scanner ler = new Scanner(System.in)) {

				do
				{
					System.out.println("Atenção: Se quiser parar, digite 0." + "\nDigite um número de sua preferência (inteiro): ");
					numero = ler.nextInt();

						if(numero!=0)
						{
							soma = soma + numero;
						}

				}while(numero>0);

				System.out.println("A soma dos números de sua preferência é: " + soma);
			}
		}
	}