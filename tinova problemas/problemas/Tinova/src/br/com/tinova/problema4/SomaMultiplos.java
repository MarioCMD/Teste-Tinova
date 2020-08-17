package br.com.tinova.problema4;

public class SomaMultiplos {

	public static int calculaMultiplos(int num) {
		int total = 0;
		for(int i = num-1; i >=3; i--) {
			if(i%3 == 0 || i%5 == 0) {
				total += i;
			}
		}
		return total;
	}
	
}
