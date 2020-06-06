package Questao04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int quantidadeDias, contagemAnos = 0, contagemMeses = 0, contagemDias = 0, restoDias = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de dias: ");
		quantidadeDias = entrada.nextInt();

		if (quantidadeDias >= 360 && quantidadeDias <= 364) {

			quantidadeDias = 359;
		}

		contagemAnos = quantidadeDias / 365;

		restoDias = quantidadeDias - contagemAnos * 365;

		contagemMeses = restoDias / 30;

		contagemDias = quantidadeDias - (contagemAnos * 365) - (contagemMeses * 30);

		System.out.println(contagemAnos + " Ano(s)");
		System.out.println(contagemMeses + " Mes(es)");
		System.out.println(contagemDias + " Dia(s)");

	}
}
