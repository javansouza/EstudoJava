package Questao01;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do Vendedor: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o salário do Vendedor: ");
		double salario = entrada.nextDouble();
		System.out.println("Digite o valor das vendas efetuadas em dinheiro do Vendedor: ");
		double vendas = entrada.nextDouble();
		
		Vendedor vendedor = new Vendedor(nome, salario, vendas);
		vendedor.calcularTotalReceber();
		
	}
	

}
