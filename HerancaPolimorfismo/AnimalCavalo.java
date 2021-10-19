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
		System.out.println(" IRRRRR�EEEEEEE! ");
	}
	
	@Override
	
	public void setCorrer(int paraVelocidade)
	{
		
			System.out.println("Voc� Sabia? O seu cavalinho quando corre pode alcan�ar 80 Km/h");
			
	}
	
}