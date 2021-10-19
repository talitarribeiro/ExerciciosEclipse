package OrientacaoObjetos1;

public class TesteCliente {
	
	public static void main(String[] args) {
		
	System.out.println("***** Mapeamento de Clientes *****");
	
	Cliente[] objCliente = new Cliente[4];
	
	objCliente[0] = new Cliente ("Roxette", "Feminino", "Rock", 61, 1500);
	objCliente[1] = new Cliente ("Joe Ramone", "Masculino", "Punk Rock", 49, 2000 );
	objCliente[2] = new Cliente ("Kurt Cobain", "Masculino", "Grunge", 27, 800);
	objCliente[3] = new Cliente ("David Bowie", "Outros", "Pop Rock", 69, 1000);
	
	for(double x=0; x<=2;x++) {
		
		objCliente[(int) x].imprimirinfomacao();
	}
	
	System.out.println("\n************************\n");
	
	}
}

