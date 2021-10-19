package OrientacaoObjetos6;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		
		//demonstração da conta
		
		ContaBancaria minhaConta = new ContaBancaria("Talita Ribeiro", 00123456-7, 0.50);
	
		//instanciando a classe ContaBancaria
		
		minhaConta.imprimirinfomacao();
		
		System.out.println("\n************************\n");
		
		//alterando os valores dentro da minha conta

        // sacar 200 reais
        minhaConta.sacar(0.10);
        
        System.out.println("**AVISO**\nFoi sacado da sua conta o valor de: R$ 0,10");
        System.out.println("\n************************\n");

        // depositar 500 reais
        minhaConta.depositar(1.50);

        System.out.println("**AVISO**\nFoi depositado na sua conta o valor de R$ 1,50");
        System.out.println("\n************************\n");
        
        minhaConta.imprimirinformacaofinal();
        	
	}

}