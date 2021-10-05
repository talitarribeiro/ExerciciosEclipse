package LacosDeRepeticao;

import java.util.Scanner;

public class exer03_quest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,numero,somapar=0,somaimpar=0;

		try (Scanner ler = new Scanner(System.in)) 

		{
			for(x=1;x<10;x++)
			{
				System.out.println("Digite 10 números que representa algum dia importante da sua vida 10 vezes: ");
				numero = ler.nextInt();

					if(numero%2==0)
					{
						somapar++;
					}
					else
					{
						somaimpar++;
					}	
			}

			System.out.println("\nNesta condição temos "+ somapar +" pares e " + somaimpar +" impares...");
		}

	}
}