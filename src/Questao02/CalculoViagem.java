package Questao02;

public class CalculoViagem {
	
	private double litrosCombustivel;
	private double consumoVeiculo = 12;
	private double tempoGasto;
	private double velocidadeMedia;
	private double distanciaPercorrida;
		
	
	
	public CalculoViagem(double tempoGasto, double velocidadeMedia) {
		this.tempoGasto = tempoGasto;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	
	public double getLitSOosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(double litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public double getTempoGasto() {
		return tempoGasto;
	}
	public void setTempoGasto(double tempoGasto) {
		this.tempoGasto = tempoGasto;
	}
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	public void calcularCombustivel() {
		
		this.distanciaPercorrida = this.tempoGasto * velocidadeMedia;
		this.litrosCombustivel = this.distanciaPercorrida / consumoVeiculo;
		System.out.printf("Quantidade de combustível necessário para a viagem é %.3f Litros" , this.litrosCombustivel);
		
	}
	
	

}
