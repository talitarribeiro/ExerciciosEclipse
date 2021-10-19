package HerancaPolimorfismo;

import java.util.Scanner;

public class AnimalCavalo extends Animal{
	
	public AnimalCavalo(String parTipo, String parNome) {
		
		super("Cavalo", parNome);
	}
	
	Scanner ler = new Scanner (System.in);
	
	@Override
	
	public void setIdade(int paraIdade) {
		
		System.out.println("Digite a idade do seu animalzinho cavalinho: ");
		paraIdade = ler.nextInt();
		
	}
	
	@Override
	
	public void setSom(String tipoSons)
	{
		System.out.println(" IRRRRRÊEEEEEEE! ");
	}
	
	@Override
	
	public void setCorrer(int paraVelocidade)
	{
		
			System.out.println("Você Sabia? O seu cavalinho quando corre pode alcançar 80 Km/h");
			
	}
	
}