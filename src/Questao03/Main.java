package Questao03;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);		
		int opcao;
		
		System.out.println("Digite um número para saber o mês correspondente em inglês: ");
		opcao = entrada.nextInt();
		
		Meses mesesAno = new Meses();
		
		mesesAno.exibirMesesAno(opcao);
		
		
	}

}

