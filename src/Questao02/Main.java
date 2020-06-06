package Questao02;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o tempo de viagem em horas: ");
		double tempoViagem = entrada.nextDouble();
		
		System.out.println("Digite a velocidade média em Km/h: ");
		double velocidadeViagem = entrada.nextDouble();
		
		CalculoViagem viagem = new CalculoViagem(tempoViagem,velocidadeViagem);
		
		viagem.calcularCombustivel();
		
		
	}

}
