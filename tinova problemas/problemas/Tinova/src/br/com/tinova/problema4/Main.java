package br.com.tinova.problema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner(System.in);
		System.out.println("Entre com o n�mero a ser utilizado na soma.");
		try {
			num = read.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("O valor entrado n�o � um inteiro");
			read.close();
			return;
		}
		System.out.println("O resultado da soma �: " + SomaMultiplos.calculaMultiplos(num));
		read.close();
	}

}
