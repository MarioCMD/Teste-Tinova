package br.com.tinova.problema1;

public class Main {

	public static void main(String[] args) {
		CalculaVotos calcula = new CalculaVotos();
		System.out.println("O percentual de votos v�lidos em rela��o ao total � de: " + calcula.calculaPercentualValidos() + "%");
		System.out.println("O percentual de votos brancos em rela��o ao total � de: " + calcula.calculaPercentualBrancos() + "%");
		System.out.println("O percentual de votos nulos em rela��o ao total � de: " + calcula.calculaPercentualNulos() + "%");
	}

}
