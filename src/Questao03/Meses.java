package Questao03;

public class Meses {
	
	String [] mesesAno = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};

	public Meses() {
		
	}

	public void exibirMesesAno(int posicao) {
		
		
		if(posicao >= 1 && posicao <= 12) {
			
			System.out.println("O n�mero digitado corresponde ao m�s " +  this.mesesAno[posicao-1]);
			
		}else {
			
			
			System.out.println("Op��o inv�lida!");
			
		}
		
	}

	
	
}
