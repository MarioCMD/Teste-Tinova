package br.com.tinova.problema1;

public class CalculaVotos {
	private int total = 1000;
	private int validos = 800;
	private int brancos = 150;
	private int nulos = 50;
	
	public int calculaPercentualValidos() {
		return (validos*100)/total;
	}
	
	public int calculaPercentualBrancos() {
		return (brancos*100)/total;
	}
	
	public int calculaPercentualNulos() {
		return (nulos*100)/total;
	}
}
