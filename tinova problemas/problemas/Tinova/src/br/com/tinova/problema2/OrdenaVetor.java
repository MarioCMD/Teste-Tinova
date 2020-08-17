package br.com.tinova.problema2;

public class OrdenaVetor {
	
	private int[] vet = {5, 3, 2, 4, 7, 1, 0, 6};
	
	public void bubbleSort() {
		int aux = 0;
		printaVetor();
		for(int i = 0; i<vet.length; i++){
			for(int j = 0; j<vet.length-1; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		printaVetor();
	}
	
	private void printaVetor() {
		for(int i = 0; i<vet.length; i++){
			System.out.print(" "+vet[i]);
		}
		System.out.print("\n");
	}

}
