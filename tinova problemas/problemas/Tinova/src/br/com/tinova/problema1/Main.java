package br.com.tinova.problema1;

public class Main {

	public static void main(String[] args) {
		CalculaVotos calcula = new CalculaVotos();
		System.out.println("O percentual de votos válidos em relação ao total é de: " + calcula.calculaPercentualValidos() + "%");
		System.out.println("O percentual de votos brancos em relação ao total é de: " + calcula.calculaPercentualBrancos() + "%");
		System.out.println("O percentual de votos nulos em relação ao total é de: " + calcula.calculaPercentualNulos() + "%");
	}

}
