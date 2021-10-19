package LacosDeRepeticao;

import java.util.Scanner;

public class exemplo0202 {

	public static void main(String[] args) {
		
		int numero, somanumero=0,cont=0;
		float medianumero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt(); //0
		
		while(numero!=0)
		{
			somanumero += numero;
			cont++;
			System.out.println("\nEntre com um próximo número: ");
			numero = leia.nextInt();			
		}
		if(cont==0) {
			System.out.println("\nNão existe divisão por 0.");
		}
		
		else
		{
		medianumero = somanumero / cont;
		System.out.printf("\nMédia dos números: %.2f", medianumero);
		}		
	}
}
