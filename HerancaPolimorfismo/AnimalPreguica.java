package HerancaPolimorfismo;


import java.util.Scanner;

public class AnimalPreguica extends Animal{
	
	public AnimalPreguica(String parTipo, String parNome) {
		
		super("Cachorro", parNome);
	
	}
	
	Scanner ler = new Scanner (System.in);
	
	@Override
	
		public void setIdade(int paraIdade) {
		
		System.out.println("Digite a idade da sua preguicinha: ");
		paraIdade = ler.nextInt();
		
	}
	
	@Override
	
	public void setSom(String tipoSons)
	{
		System.out.println(" UUUUI, UUUII");
	}
	
	@Override
	
	public void setCorrer(int paraVelocidade)
	{
		System.out.println(" Oh, não! Em termos de velocidade o seu animalzinho não tem nenhuma habilidade, por outro lado, é um ótimo nadadador.");
	}
	
}