package Questao01;

public class Vendedor {
	
	private String nome;
	private double salarioFixo;
	private double vendaEfetuadas;
	private double comissao = 0.12;
	private double totalReceber;
	
	
	
	public Vendedor(String nome, double salarioFixo, double vendaEfetuadas) {
		super();
		this.nome = nome;
		this.salarioFixo = salarioFixo;
		this.vendaEfetuadas = vendaEfetuadas;
	}




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getVendaEfetuadas() {
		return vendaEfetuadas;
	}
	public void setVendaEfetuadas(double vendaEfetuadas) {
		this.vendaEfetuadas = vendaEfetuadas;
	}
	
	public void calcularTotalReceber() {
		
		this.totalReceber = this.salarioFixo + (this.vendaEfetuadas*this.comissao);
		
		System.out.printf("SALÁRIO TOTAL = R$ %.2f", this.totalReceber);
		
	}
	
	
	
	

}
