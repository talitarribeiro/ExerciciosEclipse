package LacosDeRepeticao;

public class exer03_ques01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				double x,divisao;
				
				for(x=1000;x<=1999;x++)
				{
					divisao = x/11;
					
						if (x%11==5)
						{
							System.out.println("O número " + x + " dividido por 11 tem como resto da divisão o valor 5...");
						}
				}
		 }
}
		
//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5