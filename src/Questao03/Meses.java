package Questao03;

public class Meses {
	
	String [] mesesAno = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};

	public Meses() {
		
	}

	public void exibirMesesAno(int posicao) {
		
		
		if(posicao >= 1 && posicao <= 12) {
			
			System.out.println("O número digitado corresponde ao mês " +  this.mesesAno[posicao-1]);
			
		}else {
			
			
			System.out.println("Opção inválida!");
			
		}
		
	}

	
	
}
