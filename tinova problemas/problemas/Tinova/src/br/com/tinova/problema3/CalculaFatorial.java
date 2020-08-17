package br.com.tinova.problema3;

public class CalculaFatorial {

	public static int fatorial(int num) {
		int fat = 1;
		for(int i = 1; i <=num; i++) {
			fat *= i;
		}
		return fat;
	}
	
}
