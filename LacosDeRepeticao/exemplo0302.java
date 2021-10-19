package LacosDeRepeticao;

public class exemplo0302 {
	
	public static void main(String[] args) {
		
		int x= 50, somapar=0,somaimpar=0;
		
		do
		{
			if(x % 2 == 0)
			{
				somapar += x;
			}
			else
			{
				somaimpar += x;
			}
			x++;
		}
		while(x<=100);
		
		System.out.println("\nSomatório dos pares: "+somapar);
		System.out.println("\nSomatório dos impares: "+somaimpar);
		
				
	}

}
