package OrientacaoObjetos2;

	import java.text.NumberFormat;

	public class Aviao {
		
		//declara��o dos atributos
		
		private String Nome,Destino,Modelo;
		private double CPF,IDAssento,ValordaPassagem,Hora;
		
		//m�todo construtor 
		
			public Aviao(String Nome, double CPF, String Destino, String Modelo, double IDAssentos, double ValordaPassagem, double Hora)
			
			{
				this.Nome = Nome;
				this.CPF = CPF;
				this.Destino = Destino;
				this.IDAssento = IDAssentos;
				this.Modelo = Modelo;
				this.ValordaPassagem = ValordaPassagem;
				this.Hora = Hora;
				
			}
			
			//declara��o dos demais m�todos da classe

			public String getNome() {
				return Nome;
			}

			public void setNome(String nome) {
				Nome = nome;
			}

			public String getDestino() {
				return Destino;
			}

			public void setDestino(String destino) {
				Destino = destino;
			}

			public String getModelo() {
				return Modelo;
			}

			public void setModelo(String modelo) {
				Modelo = modelo;
			}

			public double getCPF() {
				return CPF;
			}

			public void setCPF(double cPF) {
				CPF = cPF;
			}

			public double getIDAssento() {
				return IDAssento;
			}

			public void setIDAssento(double iDAssento) {
				IDAssento = iDAssento;
			}

			public double getValordaPassagem() {
				return ValordaPassagem;
			}

			public void setValordaPassagem(double valordaPassagem) {
				ValordaPassagem = valordaPassagem;
			}

			public double getHora() {
				return Hora;
			}

			public void setHora(double hora) {
				Hora = hora;
			}
			
			public String formatarMoeda() {
				
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				nf.setMinimumFractionDigits(2);
				String formatoMoeda = nf.format(ValordaPassagem);
				return formatoMoeda;
			}
			
			public void imprimirinfomacao() {
				
				System.out.println("\n************************\n");
				System.out.println( "***Cart�o de Embarque***\n\nNome: " + Nome + "\t\tCPF: " + CPF + "\t\tDestino: " + Destino + "\nModelo do Avi�o: " + Modelo + "\tLugar do seu Acento: " + IDAssento + "\tHora da Partida: " + Hora + " Horas" + "\n\nValor da Passagem: " + this.formatarMoeda());
			}

	}