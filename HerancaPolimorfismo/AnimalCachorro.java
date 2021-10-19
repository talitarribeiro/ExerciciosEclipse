package HerancaPolimorfismo;

import java.util.Scanner;

public class AnimalCachorro extends Animal{
	
	public AnimalCachorro(String parTipo, String parNome) {
		
		super("Cachorro", parNome);
	
	}
	
	Scanner ler = new Scanner (System.in);
	
	@Override
	
	public void setIdade(int paraIdade) {
		
		System.out.println("Digite a idade do seu cachorrinho: ");
		paraIdade = ler.nextInt();
		
	}
		@Override
		
		public void setSom(String tipoSons)
		{
			System.out.println("AU, AU, AUAU! ");
		}
		
		@Override
		
		public void setCorrer(int paraVelocidade)
		{
				
			System.out.println("Voc� Sabia? O seu cachorrinho pode correr e atingir emat� 45 Km/h.");
				
		}
}