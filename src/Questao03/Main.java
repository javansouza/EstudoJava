package Questao03;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);		
		int opcao;
		
		System.out.println("Digite um n�mero para saber o m�s correspondente em ingl�s: ");
		opcao = entrada.nextInt();
		
		Meses mesesAno = new Meses();
		
		mesesAno.exibirMesesAno(opcao);
		
		
	}

}

