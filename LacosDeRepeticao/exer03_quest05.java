package LacosDeRepeticao;

import java.util.Scanner;

public class exer03_quest05 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int numero,soma=0;

			try (Scanner ler = new Scanner(System.in)) {

				do
				{
					System.out.println("Aten��o: Se quiser parar, digite 0." + "\nDigite um n�mero de sua prefer�ncia (inteiro): ");
					numero = ler.nextInt();

						if(numero!=0)
						{
							soma = soma + numero;
						}

				}while(numero>0);

				System.out.println("A soma dos n�meros de sua prefer�ncia �: " + soma);
			}
		}
	}