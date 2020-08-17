package br.com.tinova.problema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner(System.in);
		System.out.println("Entre com o n�mero a ser fatorado.");
		try {
			num = read.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("O valor entrado n�o � um inteiro");
			read.close();
			return;
		}
		System.out.println("O resultado da fatora��o �: " + CalculaFatorial.fatorial(num));
		read.close();
	}

}
