package LacosDeRepeticao;

import java.util.Scanner;

public class exer03_quest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan = new Scanner(System.in);
			int numero, soma = 0,cont = 0;
			float media;
			
			do {
				System.out.println("Para encerrar o programa digite: 0.");
				System.out.print("Informe um valor: ");
				numero = scan.nextInt();
				if(numero % 3 == 0){
					soma += numero;
					cont++;
				}
			} while (numero != 0);
			
			if(cont == 0) {
				System.out.println("Os valores informados não correspondem a espectativa.");
			}
			else {
				media = soma / cont;
				System.out.printf("A média dos multiplos de 3 informados é: %.2f", media);
			}
		}
	}
